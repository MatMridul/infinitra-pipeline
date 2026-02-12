import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Calculating conversions
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Displaying the results
        System.out.println("The distance is " + distanceInYards + " yards or " 
                           + distanceInMiles + " miles.");
        
        input.close();
    }
}
