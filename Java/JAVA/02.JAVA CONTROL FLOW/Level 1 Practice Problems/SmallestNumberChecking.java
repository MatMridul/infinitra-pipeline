import java.util.Scanner;

public class SmallestNumberChecking {
    public static void main(String[] args) {
		
		 // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		
		// Take three numbers as input
		System.out.print("Enter the First Number: ");
		int number1 = scanner.nextInt();
		
		System.out.print("Enter the Second Number: ");
		int number2 = scanner.nextInt();
		
		System.out.print("Enter the Third Number: ");
		int number3 = scanner.nextInt();
		
		// Check if the first number is the smallest
		boolean isSmallest = (number1 < number2 && number1 < number3);
		System.out.println("Checking if the first one is the smallest of the three inputted numbers " + isSmallest);
		
		// Closing the scanner
		scanner.close();
	}
}