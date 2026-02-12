import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int power = scanner.nextInt();

        int result = 1;

        // Looping to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Displaying the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        scanner.close();
    }
}
