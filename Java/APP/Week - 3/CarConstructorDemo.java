class Car {
    String model;
    int year;
    String color;

    // Constructor to initialize attributes
    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car information
    void displayCarInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class CarConstructorDemo {
    public static void main(String[] args) {
        // First car object
        Car car1 = new Car("Tesla", 2023, "White");

        // Second car object
        Car car2 = new Car("BMW", 2021, "Black");

        // Display info
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
