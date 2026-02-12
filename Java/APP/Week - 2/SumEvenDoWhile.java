import java.util.Scanner;

public class SumEvenDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 2, sum = 0;
        do {
            if (i % 2 == 0) sum += i;
            i++;
        } while (i <= n);

        System.out.println("Sum of even numbers = " + sum);
    }
}
