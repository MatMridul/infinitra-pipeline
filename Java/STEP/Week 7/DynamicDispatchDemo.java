class FoodDelivery {
    void deliver() {
        System.out.println("Delivering food...");
    }
}

class Zomato extends FoodDelivery {
    @Override
    void deliver() {
        System.out.println("Zomato delivery in progress 🚴");
    }
}

class Swiggy extends FoodDelivery {
    @Override
    void deliver() {
        System.out.println("Swiggy delivery in progress 🛵");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        FoodDelivery fd;       // Reference type = superclass
        fd = new Zomato();     // Object type = subclass
        fd.deliver();          // Zomato method

        fd = new Swiggy();     // Reassigned to another object
        fd.deliver();          // Swiggy method
    }
}
