import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for day, month, and year
        System.out.print("Enter day: ");
        int d = scanner.nextInt();
        
        System.out.print("Enter month: ");
        int m = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        // Formula for calculating the day of the week
        int y0 = y - (14 - m) / 12;  // Adjust the year based on the month
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;  // Leap year adjustments
        int m0 = m + 12 * ((14 - m) / 12) - 2;  // Adjust the month value
        int d0 = (d + x + (31 * m0) / 12) % 7;  // Compute day of the week (0=Sunday, 1=Monday,...)

        // Displaying the day of the week
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("The day of the week is: " + days[d0]);

        scanner.close();
    }
}
