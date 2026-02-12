import java.util.Scanner;

public class LargestTwoDigitsV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.next();  // Read the number as a string

        int maxDigit = number.length();
        int[] digits = new int[maxDigit];  // Initial array to store digits
        int index = 0;

        // Storing digits in an array
        for (char ch : number.toCharArray()) {
            if (index == maxDigit) {  // Expand array when limit is reached
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = ch - '0'; // Convert char to int
        }

        // Finding the largest and second largest digits
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying the result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "No second largest digit" : secondLargest));

        sc.close();
    }
}
