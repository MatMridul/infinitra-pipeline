\import java.util.Scanner;
public class HeightConverter {

    public static void main(String[] args) {
        // Declare variable for height in centimeters
        double heightCm;

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for height input
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        // Conversion constants
        double cmToInches = 1.0 / 2.54;
        double inchesToFeet = 1.0 / 12.0;

        // Convert height from cm to inches
        double heightInches = heightCm * cmToInches;

        // Calculate feet by casting to int to get whole number
        int feet = (int) (heightInches * inchesToFeet); 

        // Calculate remaining inches after converting to feet
        double remainingInches = heightInches - (feet * 12);

        // Display height in cm, feet, and inches
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", 
                          heightCm, feet, remainingInches);

        // Close the Scanner to avoid memory leak
        input.close();
    }
}
