import java.util.Scanner;

public class SpringSeasonCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        // Check if it's spring season
        boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");

        scanner.close(); // Close scanner
    }
}
