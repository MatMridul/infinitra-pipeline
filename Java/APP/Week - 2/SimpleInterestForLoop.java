import java.util.Scanner;

public class SimpleInterestForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            double si = (p * r * i) / 100;
            System.out.println("Simple Interest for " + i + " year(s): " + si);
        }
    }
}
