import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;

        // Sum of divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors is greater than the number
        System.out.println(num + " is " + (sum > num ? "an Abundant Number." : "NOT an Abundant Number."));
    }
}
