import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition or 2 for subtraction.");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Sum = " + (a + b));
        } else if (choice == 2) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Difference = " + (a - b));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
