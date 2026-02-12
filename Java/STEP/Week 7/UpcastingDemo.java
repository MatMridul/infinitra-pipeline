class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks 🐶");
    }
}

public class UpcastingDemo {
    public static void main(String[] args) {
        Animal a = new Dog();   // Upcasting
        a.sound();              // Calls Dog's overridden method
        // a.fetch(); ❌ Not allowed (compile-time limitation)
    }
}
