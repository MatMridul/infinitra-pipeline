import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Assume the number is prime unless proven otherwise
        boolean isPrime = num > 1;

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false; // Not prime if divisible
                break;
            }
        }

        // Print result
        System.out.println(num + " is " + (isPrime ? "a Prime Number." : "NOT a Prime Number."));
    }
}
