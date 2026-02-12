class Car {
    String model;
    int year;
    String color;

    // Method to display car information
    void displayCarInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // First car object
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2020;
        car1.color = "Red";

        // Second car object
        Car car2 = new Car();
        car2.model = "Honda";
        car2.year = 2022;
        car2.color = "Blue";

        // Display info
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
