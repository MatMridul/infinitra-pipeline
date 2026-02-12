import java.util.Scanner;

public class KmToMiles {

    public static void main(String[] args) {
        // Declare variable for distance in kilometers
        double km;

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();  // Using nextDouble() for decimal input

        // Convert kilometers to miles using the conversion rate
        double miles = km / 1.6;

        // Display the converted distance
        System.out.printf("The total miles is %.2f miles for the given %.2f km%n", miles, km);

        // Close the Scanner to avoid memory leak
        input.close();
    }
}
