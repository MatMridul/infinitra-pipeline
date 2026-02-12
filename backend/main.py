from fastapi import FastAPI # type: ignore
from fastapi.middleware.cors import CORSMiddleware # type: ignore
from pydantic import BaseModel # type: ignore
import os

app = FastAPI(title="Infinitra Backend")

# CORS: dev (Vite) + allow extra origins via env in prod
default_origins = ["http://localhost:5173"]
env_origins = os.getenv("ALLOWED_ORIGINS", "")
if env_origins:
    default_origins.extend([o.strip() for o in env_origins.split(",") if o.strip()])

app.add_middleware(
    CORSMiddleware,
    allow_origins=default_origins,
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

class ChatRequest(BaseModel):
    message: str

class ChatResponse(BaseModel):
    reply: str

@app.get("/health")
def health():
    return {"status": "ok", "service": "backend"}

@app.post("/api/chat", response_model=ChatResponse)
def chat(req: ChatRequest):
    user_msg = req.message.strip()

    # placeholder logic (safe default)
    if user_msg.lower() in {"hi", "hello", "hey"}:
        reply = "Hey! 👋 I’m your Infinitra assistant. How can I help?"
    elif "admission" in user_msg.lower():
        reply = "Admissions info coming soon. Ask me anything and I’ll guide you."
    else:
        reply = f"You said: “{user_msg}”. I’ll soon be powered by a real model."

    return ChatResponse(reply=reply)
