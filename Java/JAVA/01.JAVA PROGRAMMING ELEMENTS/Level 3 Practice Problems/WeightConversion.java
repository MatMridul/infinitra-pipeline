import java.util.Scanner;

class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking weight in pounds as input
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        // Converting to kilograms
        double kilograms = pounds / 2.2;

        // Displaying the result
        System.out.println("The weight in pounds is " + pounds + " and in kg is " + kilograms);

        input.close();
    }
}
