import java.util.Scanner;

class TemperatureConversionFtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking temperature in Fahrenheit as input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Converting Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Displaying the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius.");

        input.close();
    }
}
