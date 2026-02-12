import java.util.*;

public class TextEditorUndo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command (TYPE/UNDO/PRINT/EXIT): ");
            String cmd = sc.next();
            if (cmd.equals("TYPE")) {
                String word = sc.next();
                stack.push(word);
            } else if (cmd.equals("UNDO")) {
                if (!stack.isEmpty()) stack.pop();
            } else if (cmd.equals("PRINT")) {
                for (String s : stack)
                    System.out.print(s + " ");
                System.out.println();
            } else if (cmd.equals("EXIT")) {
                break;
            }
        }
    }
}
