// Program demonstrating static and non-static methods
//Mridul RA241126010137
class Five {
    public static int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Static method add: " + Five.add(10, 5));

        Five mu = new Five();
        System.out.println("Non-static method multiply: " + mu.multiply(10, 5));
    }
}

