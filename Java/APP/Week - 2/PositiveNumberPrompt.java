import java.util.Scanner;

public class PositiveNumberPrompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a positive number: ");
            n = sc.nextInt();
        } while (n <= 0);

        System.out.println("Thank you! You entered: " + n);
    }
}
