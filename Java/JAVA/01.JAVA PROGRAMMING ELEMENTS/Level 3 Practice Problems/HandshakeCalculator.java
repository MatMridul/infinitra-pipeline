import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking number of students as input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculating maximum handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying the result
        System.out.println("The maximum number of handshakes possible is " + maxHandshakes);

        input.close();
    }
}
