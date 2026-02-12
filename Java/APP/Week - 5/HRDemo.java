import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working on general tasks.");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    private List<Employee> team = new ArrayList<>();

    HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " (HR Manager) is handling hiring and employee relations.");
    }

    void addEmployee(Employee e) {
        team.add(e);
        System.out.println("Added " + e.name + " to HR records.");
    }

    void listTeam() {
        System.out.println("HR records: ");
        for (Employee e : team) {
            System.out.println("- " + e.name + " (Salary: " + e.salary + ")");
        }
    }
}

public class HRDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Aditi", 30000);
        HRManager hr = new HRManager("Rohan", 60000);

        emp.work();
        hr.work();

        hr.addEmployee(new Employee("Sahil", 25000));
        hr.addEmployee(new Employee("Maya", 28000));
        hr.listTeam();

        System.out.println("HR salary: " + hr.getSalary());
    }
}
