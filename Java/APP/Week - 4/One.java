// Program demonstrating private variables with getter and setter
//Mridul RA241126010137
public class One {
    private int marks;

    public void setMarks(int m) {
        this.marks = m;
    }

    public int getMarks() {
        return this.marks;
    }

    public static void main(String[] args) {
        One s = new One();
        s.setMarks(85);
        System.out.println("Student marks: " + s.getMarks());
        // this line caused compile time error
        // System.out.println("Direct access marks: " + s.marks);
    }
}

