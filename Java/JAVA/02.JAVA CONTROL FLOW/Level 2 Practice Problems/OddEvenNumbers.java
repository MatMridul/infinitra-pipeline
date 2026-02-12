import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Checking if the input is a natural number
        if (number < 1) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Looping through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Checking if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
        scanner.close();
    }
}
