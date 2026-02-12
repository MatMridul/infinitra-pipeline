class Game {
    // Overloaded methods: same name, different parameters
    void attack(String weapon) {
        System.out.println("Attacking with " + weapon);
    }

    void attack(String weapon, int power) {
        System.out.println("Attacking with " + weapon + " at power " + power);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Game g = new Game();
        g.attack("Sword");             // Calls first method
        g.attack("Bow", 75);           // Calls overloaded method
    }
}
