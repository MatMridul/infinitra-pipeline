public class ProfitLoss {
// Class to calculate profit and profit percentage
// Main method starts execution

    public static void main(String[] args) {

        double costPrice = 129;
// Cost price of the product
        double sellingPrice = 191;
// Selling price of the product

        double profit = sellingPrice - costPrice;
// Calculate profit

        double profitPercentage = (profit / costPrice) * 100;
// Calculate profit percentage

        System.out.printf("The Cost Price is INR %.2f and Selling Price is INR %.2f%n" +
// Display profit details
                          "The Profit is INR %.2f and the Profit Percentage is %.2f%%", 
                          costPrice, sellingPrice, profit, profitPercentage);
    }
}
