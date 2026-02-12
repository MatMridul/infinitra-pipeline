import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Swapping numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Displaying the swapped values
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        input.close();
    }
}
