import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		double total = 0.0;
		
		while (true) {
			System.out.print("Enter a number (0 or negative to stop): ");
			double number = scanner.nextDouble();
			
			// Break if user enters 0 or any negative number
			if (number <=0) break;
			
			// Add the number to keep the loop going
			total += number;
			
		}
		
		System.out.println("Total sum: " + total);
		scanner.close();
		
	}
}