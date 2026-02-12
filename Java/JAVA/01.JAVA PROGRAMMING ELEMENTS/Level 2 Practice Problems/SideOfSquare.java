import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculating the side length
        double side = perimeter / 4;

        // Displaying the result
        System.out.println("The length of the side is " + side 
                           + " whose perimeter is " + perimeter + ".");
        
        input.close();
    }
}
