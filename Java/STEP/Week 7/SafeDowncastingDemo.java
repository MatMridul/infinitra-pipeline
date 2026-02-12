class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class CreditCard extends Payment {
    void limitCheck() {
        System.out.println("Checking credit limit 💳");
    }
}

public class SafeDowncastingDemo {
    public static void main(String[] args) {
        Payment p = new CreditCard();

        if (p instanceof CreditCard cc) {   // Safe check with pattern matching
            cc.pay();
            cc.limitCheck();
        } else {
            System.out.println("Not a CreditCard payment method");
        }
    }
}
