import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number]; // Array to store weight status

        // Input weight and height for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input weight with validation
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be a positive value. Try again.");
                }
            } while (personData[i][0] <= 0);

            // Input height with validation
            do {
                System.out.print("Enter height (m): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be a positive value. Try again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI: BMI = weight / (height * height)
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the height, weight, BMI, and weight status for each person
        System.out.println("\n------------------- BMI REPORT -------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(m)", "BMI", "Status");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
