from transformers import AutoModelForCausalLM, AutoTokenizer
import torch
import os

# ----------------- Model Setup -----------------
model_name = "microsoft/DialoGPT-large"
tokenizer = AutoTokenizer.from_pretrained(model_name)
model = AutoModelForCausalLM.from_pretrained(model_name)

if tokenizer.pad_token is None:
    tokenizer.pad_token = tokenizer.eos_token

device = torch.device("cuda" if torch.cuda.is_available() else "cpu")
model.to(device)
model.eval()

# ----------------- Persona (global, once) -----------------
persona_text = (
    "System: You are Dialo-GPT, a friendly and helpful AI assistant. "
    "You always answer politely and never pretend to be the user. "
    "When asked your identity, respond exactly: 'My name is Dialo-GPT, "
    "an AI language model developed by Microsoft.' "
    "You may give humorous responses, but avoid controversial or sensitive topics."
)
persona_ids = tokenizer.encode(persona_text + tokenizer.eos_token, return_tensors="pt").to(device)

# Initialize history with persona pinned
chat_history_ids = persona_ids.clone()

# ----------------- Config -----------------
history_file = "chat_history.pth"
if os.path.exists(history_file):
    os.remove(history_file)

DEFAULT_TEMPERATURE = 0.45
DEFAULT_TOP_K = 50
DEFAULT_TOP_P = 0.9
MAX_HISTORY = 1024
MAX_NEW_TOKENS = 60


# ----------------- Response Generator -----------------
def generate_response(user_input,
                      temperature=DEFAULT_TEMPERATURE,
                      top_k=DEFAULT_TOP_K,
                      top_p=DEFAULT_TOP_P,
                      max_history=MAX_HISTORY,
                      max_new_tokens=MAX_NEW_TOKENS):
    global chat_history_ids

    # ---- Intercept identity questions ----
    q = user_input.strip().lower()
    identity_triggers = ["your name", "who are you", "what is your name", "who created you"]
    if any(t in q for t in identity_triggers):
        forced_reply = "My name is Dialo-GPT, an AI language model developed by Microsoft and brought to life by mridul."
        user_turn_ids = tokenizer.encode(user_input + tokenizer.eos_token, return_tensors="pt").to(device)
        forced_ids = tokenizer.encode(forced_reply + tokenizer.eos_token, return_tensors="pt").to(device)

        if chat_history_ids is None:
            chat_history_ids = torch.cat([persona_ids, user_turn_ids, forced_ids], dim=-1)
        else:
            chat_history_ids = torch.cat([chat_history_ids, user_turn_ids, forced_ids], dim=-1)

        # trim history if too long
        if chat_history_ids.shape[-1] > max_history:
            persona_len = persona_ids.shape[-1]
            keep_recent = max_history - persona_len
            if keep_recent > 0:
                recent_tail = chat_history_ids[:, -keep_recent:]
                chat_history_ids = torch.cat([persona_ids, recent_tail], dim=-1)
            else:
                chat_history_ids = chat_history_ids[:, -max_history:]

        return forced_reply

    # ---- Normal user input ----
    user_input_ids = tokenizer.encode(user_input + tokenizer.eos_token, return_tensors="pt").to(device)

    if chat_history_ids is not None:
        input_ids = torch.cat([chat_history_ids, user_input_ids], dim=-1)
    else:
        input_ids = user_input_ids

    # trim to max_history
    if input_ids.shape[-1] > max_history:
        input_ids = input_ids[:, -max_history:]

    attention_mask = torch.ones_like(input_ids, dtype=torch.long).to(device)

    with torch.no_grad():
        response_ids = model.generate(
            input_ids,
            attention_mask=attention_mask,
            max_new_tokens=max_new_tokens,
            pad_token_id=tokenizer.eos_token_id,
            temperature=temperature,
            top_k=top_k,
            top_p=top_p,
            do_sample=True,
            no_repeat_ngram_size=2,
        )

    generated_ids = response_ids[:, input_ids.shape[-1]:]
    response_text = tokenizer.decode(generated_ids[0], skip_special_tokens=True).strip()

    # ---- Update history ----
    new_chunk = torch.cat([user_input_ids, generated_ids], dim=-1)

    if chat_history_ids is None:
        chat_history_ids = torch.cat([persona_ids, new_chunk], dim=-1)
    else:
        chat_history_ids = torch.cat([chat_history_ids, new_chunk], dim=-1)

    # trim history if too long
    if chat_history_ids.shape[-1] > max_history:
        persona_len = persona_ids.shape[-1]
        keep_recent = max_history - persona_len
        if keep_recent > 0:
            recent_tail = chat_history_ids[:, -keep_recent:]
            chat_history_ids = torch.cat([persona_ids, recent_tail], dim=-1)
        else:
            chat_history_ids = chat_history_ids[:, -max_history:]

    return response_text


# ----------------- Main Loop -----------------
if __name__ == "__main__":
    print("Model loaded successfully")
    print("Chatbot is running! Type 'exit' to quit.")

    while True:
        try:
            user_input = input("You: ").strip()
        except (KeyboardInterrupt, EOFError):
            print("\nDialo-GPT: Bye!")
            break

        if user_input.lower() in ("exit", "quit"):
            print("Dialo-GPT: Goodbye!")
            break

        response = generate_response(user_input)
        print("Dialo-GPT:", response)
