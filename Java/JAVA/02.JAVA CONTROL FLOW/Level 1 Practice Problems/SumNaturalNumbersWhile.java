import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // Compute using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute using while loop
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

            // Compare the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Results match: " + (sum == formulaSum));

        } else {
            System.out.println("Please enter a valid natural number.");
        }

        scanner.close();
    }
}
