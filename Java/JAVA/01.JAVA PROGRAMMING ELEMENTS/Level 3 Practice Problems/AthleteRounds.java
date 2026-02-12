import java.util.Scanner;

class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking side lengths as input
        System.out.print("Enter side1 (meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2 (meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side3 (meters): ");
        double side3 = input.nextDouble();

        // Calculating perimeter
        double perimeter = side1 + side2 + side3;

        // Calculating number of rounds
        int rounds = (int) Math.ceil(5000 / perimeter);

        // Displaying the result
        System.out.println("The total number of rounds the athlete must run to complete 5 km is " + rounds);

        input.close();
    }
}
