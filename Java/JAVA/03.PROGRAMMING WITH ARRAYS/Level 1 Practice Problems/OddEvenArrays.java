import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Not a natural number!");
            return;
        }

        System.out.println("Even numbers:");
        for (int i = 2; i <= number; i += 2) System.out.print(i + " ");

        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= number; i += 2) System.out.print(i + " ");

        scanner.close();
    }
}
