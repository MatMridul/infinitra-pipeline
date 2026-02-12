class Rectangle {
    double width;
    double height;

    // Method to calculate area
    double area() {
        return width * height;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (width + height);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 5.0;
        r.height = 3.0;

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
