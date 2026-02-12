import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        // Take input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if it's a natural number (positive integer)
        if (n > 0) {
            int sum = n * (n + 1) / 2; // Use formula for sum of first n natural numbers
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        scanner.close(); // Close scanner
    }
}
