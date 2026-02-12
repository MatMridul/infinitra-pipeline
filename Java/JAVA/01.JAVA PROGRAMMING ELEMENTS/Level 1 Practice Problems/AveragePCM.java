public class AveragePCM {
// Class to calculate average marks in PCM
// Main method starts execution

    public static void main(String[] args) {

        int mathsMarks = 94;
// Marks in Maths
        int physicsMarks = 95;
// Marks in Physics
        int chemistryMarks = 96;
// Marks in Chemistry

        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;
// Total marks in PCM

        double averageMarks = (double) totalMarks / 3;  
// Calculate average marks

        double averagePercentage = (averageMarks / 100) * 100; 

        System.out.println("Sam's average mark in PCM is " + averagePercentage);
// Display average
    }
}
