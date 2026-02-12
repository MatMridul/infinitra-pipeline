import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0, originalNum = num;

        // Sum up the digits
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        // Check divisibility
        System.out.println(originalNum + " is " + (originalNum % sum == 0 ? "a Harshad Number." : "NOT a Harshad Number."));
    }
}
