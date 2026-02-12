import java.util.Scanner;

class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking chocolates and children count as input
        System.out.print("Enter total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculating chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Displaying the result
        System.out.println("Each child gets " + chocolatesPerChild + " chocolates.");
        System.out.println("The number of remaining chocolates is " + remainingChocolates);

        input.close();
    }
}
