public class MeanHeight {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the number of heights: ");
        int n = scanner.nextInt();

        double[] heights = new double[n];

        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        double meanHeight = sum / n;

        // Print the mean height
        System.out.printf("Mean height: %.2f\n", meanHeight);

        // Close the scanner
        scanner.close();
    }
}
