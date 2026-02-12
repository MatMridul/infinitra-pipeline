public class KilometersToMiles {
// Class to convert kilometers to miles
// Main method starts execution

    public static void main(String[] args) {

        double kilometers = 10.8;
// Distance in kilometers

        double milesPerKilometer = 0.621371; 

        double miles = kilometers * milesPerKilometer;
// Convert km to miles

        System.out.printf("The distance %.2f km in miles is %.2f%n", kilometers, miles); 
// Display distance in miles
    }
}
