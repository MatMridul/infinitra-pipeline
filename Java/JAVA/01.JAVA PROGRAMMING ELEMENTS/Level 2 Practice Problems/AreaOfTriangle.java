import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Calculating the area
        double areaSqInches = 0.5 * base * height;
        double areaSqCm = areaSqInches * 6.4516; // 1 square inch = 6.4516 square cm

        // Displaying the results
        System.out.println("The area of the triangle is " + areaSqInches 
                           + " square inches or " + areaSqCm + " square centimeters.");
        
        input.close();
    }
}
