import java.util.Scanner;

public class DivisibilityCheckBy5 {
    public static void main(String[] args) {
		
		 // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
		
        int number = scanner.nextInt(); 

        // Check divisibility by 5 and print the result
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));

        scanner.close();
    }
}
