import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store numbers
        double total = 0;
        int index = 0;

        // Taking input until 0 or negative number is encountered
        while (true) {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();

            if (num <= 0 || index == 10) break; // Stop input if number is negative or zero

            numbers[index++] = num; // Store the number
        }

        // Calculating the sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Sum of entered numbers: " + total);
        scanner.close();
    }
}
