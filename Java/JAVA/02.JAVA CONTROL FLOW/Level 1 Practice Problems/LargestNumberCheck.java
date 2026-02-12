import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
		
		 // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		
		// Take three numbers as input
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
		
		// Checking all possible boolean permutations for number1, number2 and number3 using boolean operators
		System.out.println("Is the first number the largest? " + (number1 < number2 && number1 > number3));
		System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
		System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));
		
		// Close scanner
		scanner.close(); 
    }
}
		