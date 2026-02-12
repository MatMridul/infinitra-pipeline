import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11]; // Array to store heights
        double sum = 0;

        // Taking input for heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculating mean height
        double mean = sum / 11;
        System.out.println("Mean height of the football team: " + mean);
        scanner.close();
    }
}
