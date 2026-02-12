import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String numStr = Integer.toString(num);
        System.out.print("Reversed Number: ");
        for (int i = numStr.length() - 1; i >= 0; i--) {
            System.out.print(numStr.charAt(i));
        }
        System.out.println();
        
        sc.close();
    }
}
