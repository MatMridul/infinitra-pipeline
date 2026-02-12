import java.util.Scanner;  // Import Scanner class for user input

public class LargestNSmallestIntegerFromArray {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Declare an array to store the elements
        int[] numbers = new int[n];
        
        // Take input from the user and store it in the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();  // Store the input in the array
        }
        
        // Initialize variables for the largest and smallest number
        int largest = numbers[0];
        int smallest = numbers[0];
        
        // Loop through the array to find the largest and smallest numbers
        for (int i = 1; i < n; i++) {
            if (numbers[i3] > largest) {
                largest = numbers[i];  // Update largest if current element is greater
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];  // Update smallest if current element is smaller
            }
        }
        
        // Display the results
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
