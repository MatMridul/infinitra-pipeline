class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void openTrunk() {
        System.out.println("Opening car trunk 🚗");
    }
}

public class DowncastingDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();     // Upcasting
        Car c = (Car) v;           // Downcasting
        c.drive();
        c.openTrunk();             // Subclass-specific method
    }
}
