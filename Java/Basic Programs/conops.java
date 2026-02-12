import java.util.Scanner;
public class conops{
    public static void main(String[]args) {
     try (Scanner sc=new Scanner(System.in)){
            System.out.println("\nEnter a number:");
            int number= sc.nextInt();
            System.out.println("is the number even?" + (number % 2 ==0));
            System.err.println("is the number positive?" + (number > 0));
            System.err.println("is the number 0?" + (number == 0));
     }
    }

}