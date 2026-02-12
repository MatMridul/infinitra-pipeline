import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num, sum = 0;

        // Calculate sum of cubes of each digit
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        // Compare sum with the original number
        System.out.println(originalNum + " is " + (sum == originalNum ? "an Armstrong Number." : "NOT an Armstrong Number."));
    }
}
