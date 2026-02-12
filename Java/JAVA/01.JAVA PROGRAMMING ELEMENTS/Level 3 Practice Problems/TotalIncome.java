import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking salary and bonus as input and then running calculations later
        System.out.print("Enter salary (INR): ");
        double salary = input.nextDouble();

        System.out.print("Enter bonus (INR): ");
        double bonus = input.nextDouble();

        // Calculating total income value
        double totalIncome = salary + bonus;

        // Displaying the results
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence, Total Income is INR " + totalIncome);

        input.close();
    }
}
