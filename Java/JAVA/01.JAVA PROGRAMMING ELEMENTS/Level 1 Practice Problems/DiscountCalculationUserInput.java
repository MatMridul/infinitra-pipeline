import java.util.Scanner;
public class DiscountCalculationUserInput {
    // Class to calculate discounted fee using user input

    public static void main(String[] args) {
        // Declare variables for fee and discount percentage
        double fee;
        double discountPercent;

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for fee input
        System.out.print("Enter the course fee (INR): ");
        fee = input.nextDouble();

        // Prompt user for discount percentage input
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate final fee after discount
        double discountedFee = fee - discount;

        // Display the discount amount and the final fee
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", 
                          discount, discountedFee);

        // Close the Scanner to avoid memory leak
        input.close();
    }
