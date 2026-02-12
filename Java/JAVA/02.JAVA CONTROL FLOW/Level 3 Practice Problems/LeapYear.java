import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is valid (Gregorian calendar started in 1582)
        if (year >= 1582) {
            // Leap year condition: divisible by 4
            if (year % 4 == 0) {
                // Not a leap year if divisible by 100, unless also divisible by 400
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Invalid input! Leap Year calculations start from 1582.");
        }
    }
}
