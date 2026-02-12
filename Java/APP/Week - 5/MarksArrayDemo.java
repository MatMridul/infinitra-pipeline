import java.util.Scanner;

public class MarksArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] marks = new int[n];

        System.out.println("Enter marks of " + n + " students (0-100):");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int highestIndex = 0;
        int sum = marks[0];

        for (int i = 1; i < n; i++) {
            sum += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
                highestIndex = i;
            }
        }

        double average = (double) sum / n;

        System.out.println("Highest mark = " + highest);
        System.out.println("Average mark = " + average);
        System.out.println("Roll number of highest scorer = " + (highestIndex + 1));
    }
}
