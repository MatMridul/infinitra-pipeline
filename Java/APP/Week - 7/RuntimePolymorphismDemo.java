class Bank {
    double rateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double rateOfInterest() {
        return 6.5;
    }
}

class ICICI extends Bank {
    @Override
    double rateOfInterest() {
        return 7.0;
    }
}

class HDFC extends Bank {
    @Override
    double rateOfInterest() {
        return 6.8;
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Bank b; // reference variable of parent class

        b = new SBI();  
        System.out.println("SBI Rate of Interest: " + b.rateOfInterest() + "%");

        b = new ICICI();  
        System.out.println("ICICI Rate of Interest: " + b.rateOfInterest() + "%");

        b = new HDFC();  
        System.out.println("HDFC Rate of Interest: " + b.rateOfInterest() + "%");
    }
}
