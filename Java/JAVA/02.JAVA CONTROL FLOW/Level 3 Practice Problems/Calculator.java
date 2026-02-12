import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();
        
        // Taking operator input
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        
        double result;

        // Using switch-case to perform the required operation
        switch (op) {
            case '+':
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case '/':
                // Checking if the denominator is not zero to avoid division by zero error
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                // If the operator is invalid
                System.out.println("Invalid operator! Please enter +, -, *, or /.");
        }
        
        scanner.close();
    }
}
