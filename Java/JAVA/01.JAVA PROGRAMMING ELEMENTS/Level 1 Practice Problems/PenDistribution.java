public class PenDistribution {
// Class to calculate pen distribution among students
// Main method starts execution

    public static void main(String[] args) {

        int totalPens = 14;
// Total number of pens

        int numStudents = 3;
// Number of students

        int pensPerStudent = totalPens / numStudents;
// Pens per student

        int remainingPens = totalPens % numStudents;
// Remaining pens after distribution

        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d%n",  pensPerStudent, remainingPens);
// Display pen distribution
    }
}
