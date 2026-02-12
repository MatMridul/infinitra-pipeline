import java.util.Scanner;

public class WeeklySalesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = 7;
        double[] sales = new double[days];

        System.out.println("Enter sales for 7 days:");
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            sales[i] = sc.nextDouble();
        }

        double total = 0;
        double minSale = sales[0];
        int minDayIndex = 0;

        for (int i = 0; i < days; i++) {
            total += sales[i];
            if (sales[i] < minSale) {
                minSale = sales[i];
                minDayIndex = i;
            }
        }

        System.out.println("Total sales for the week = " + total);
        System.out.println("Lowest sales on Day " + (minDayIndex + 1) + " with amount = " + minSale);
    }
}
