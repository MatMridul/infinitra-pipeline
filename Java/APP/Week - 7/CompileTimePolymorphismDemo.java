class BillingCounter {
    // Bill for 2 items
    int generateBill(int item1, int item2) {
        return item1 + item2;
    }

    // Bill for 3 items
    int generateBill(int item1, int item2, int item3) {
        return item1 + item2 + item3;
    }

    // Bill for 4 items
    int generateBill(int item1, int item2, int item3, int item4) {
        return item1 + item2 + item3 + item4;
    }
}

public class CompileTimePolymorphismDemo {
    public static void main(String[] args) {
        BillingCounter counter = new BillingCounter();

        System.out.println("Bill for 2 items: " + counter.generateBill(100, 200));
        System.out.println("Bill for 3 items: " + counter.generateBill(100, 200, 300));
        System.out.println("Bill for 4 items: " + counter.generateBill(100, 200, 300, 400));
    }
}
