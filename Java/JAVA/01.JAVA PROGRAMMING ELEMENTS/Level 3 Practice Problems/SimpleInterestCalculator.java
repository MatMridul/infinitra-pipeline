import java.util.Scanner;

class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking inputs for principal, rate, and time
        System.out.print("Enter Principal Amount (INR): ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (Years): ");
        double time = input.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("The Simple Interest is INR " + simpleInterest + 
                           " for Principal INR " + principal + 
                           ", Rate of Interest " + rate + "% and Time " + time + " years.");

        input.close();
    }
}
