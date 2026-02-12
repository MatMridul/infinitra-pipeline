import java.util.Scanner;

	class TemperatureConversionCtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking temperature in Celsius as input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Converting Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Displaying the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

        input.close();
    }
}
