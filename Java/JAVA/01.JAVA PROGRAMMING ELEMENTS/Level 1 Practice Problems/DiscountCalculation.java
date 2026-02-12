public class DiscountCalculation {
// Class to calculate discounted fee
// Main method starts execution

    public static void main(String[] args) {

        double fee = 125000;
// Initial course fee

        double discountPercent = 10;
// Discount percentage

        double discount = (discountPercent / 100) * fee;
// Calculate discount amount

        double discountedFee = fee - discount;
// Calculate final fee after discount

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, discountedFee);
// Display discount details
    }
}
