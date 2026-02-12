import java.util.Scanner;

class TravelComputationUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter name: ");
        String name = input.next();

        System.out.print("Enter From City: ");
        String fromCity = input.next();

        System.out.print("Enter Via City: ");
        String viaCity = input.next();

        System.out.print("Enter Destination City: ");
        String toCity = input.next();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (Miles): ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (Miles): ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter total time taken (in minutes): ");
        int totalTime = input.nextInt();

        // Calculating total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Displaying the result
        System.out.println(name + " traveled from " + fromCity + " to " + toCity + 
                           " via " + viaCity + " covering " + totalDistance + " miles in " + totalTime + " minutes.");

        input.close();
    }
}
