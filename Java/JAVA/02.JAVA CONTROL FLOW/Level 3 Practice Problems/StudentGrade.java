import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three subjects
        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = scanner.nextInt();

        // Calculate average marks
        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Marks: " + average);

        // Assign grades based on average marks
        if (average >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (average >= 75) {
            System.out.println("Grade: B (Very Good)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Good)");
        } else if (average >= 40) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
}
