class HelloThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome");
        }
    }
}

public class HelloWelcomeDemo {
    public static void main(String[] args) {
        new HelloThread().start();
        new WelcomeThread().start();
    }
}
