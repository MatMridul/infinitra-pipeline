import java.util.Scanner;
class AnglesofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three angles of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a+b+c == 180) {
            System.out.println("The given angles are internal angles of a triangle");
        } else {
            System.out.println("The given angles are not internal angles of a triangle");
        }
        }
    }