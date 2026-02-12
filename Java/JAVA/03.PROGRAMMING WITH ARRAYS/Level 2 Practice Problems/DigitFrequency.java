import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();
        
        // Convert number to positive (in case of negative input)
        number = Math.abs(number);
        
        // Array to store frequency of digits (0-9)
        int[] frequency = new int[10];
        
        // Extract digits and update frequency array
        while (number > 0) {
            int digit = (int) (number % 10); // Get the last digit
            frequency[digit]++; // Increment frequency of the digit
            number /= 10; // Remove the last digit
        }
        
        // Display frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Display only digits that appear in the number
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }
    }
}
