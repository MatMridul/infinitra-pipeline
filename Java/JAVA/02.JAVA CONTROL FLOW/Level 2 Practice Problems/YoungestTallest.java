import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking age and height inputs for three friends
        System.out.print("Enter Amar's age: ");
        int age1 = scanner.nextInt();
        System.out.print("Enter Amar's height: ");
        int height1 = scanner.nextInt();

        System.out.print("Enter Akbar's age: ");
        int age2 = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        int height2 = scanner.nextInt();

        System.out.print("Enter Anthony's age: ");
        int age3 = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        int height3 = scanner.nextInt();

        // Finding the youngest friend
        int youngest = Math.min(age1, Math.min(age2, age3));

        // Finding the tallest friend
        int tallest = Math.max(height1, Math.max(height2, height3));

        // Displaying results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
