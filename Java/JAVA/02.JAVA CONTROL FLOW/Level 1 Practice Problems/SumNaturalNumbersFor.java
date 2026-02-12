import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // Compute using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute using for loop
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // Compare the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Results match: " + (sum == formulaSum));

        } else {
            System.out.println("Please enter a valid natural number.");
        }

        scanner.close();
    }
}
