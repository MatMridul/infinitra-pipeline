import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Simple bonus calculation: default 5% of salary
    double calculateBonus() {
        return salary * 0.05;
    }

    String performanceReport() {
        return name + " (" + jobTitle + ") - Performance: Satisfactory.";
    }
}

class Manager extends Employee {
    List<String> projects = new ArrayList<>();

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    double calculateBonus() {
        // Managers get 15% bonus
        return salary * 0.15;
    }

    @Override
    String performanceReport() {
        return name + " (Manager) - Leads projects: " + projects.size();
    }

    void addProject(String project) {
        projects.add(project);
        System.out.println("Project '" + project + "' added to " + name + "'s list.");
    }
}

class Developer extends Employee {
    List<String> tasks = new ArrayList<>();

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    double calculateBonus() {
        // Developers get 10% bonus
        return salary * 0.10;
    }

    @Override
    String performanceReport() {
        return name + " (Developer) - Tasks assigned: " + tasks.size();
    }

    void assignTask(String task) {
        tasks.add(task);
        System.out.println("Task '" + task + "' assigned to " + name + ".");
    }
}

class Programmer extends Employee {
    int bugsFixed;

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    double calculateBonus() {
        // Programmers get base 8% + 0.5% per bug fixed
        return salary * (0.08 + 0.005 * bugsFixed);
    }

    @Override
    String performanceReport() {
        return name + " (Programmer) - Bugs fixed: " + bugsFixed;
    }

    void fixBug() {
        bugsFixed++;
        System.out.println(name + " fixed a bug. Total fixed: " + bugsFixed);
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Leena", "Bengaluru", 120000);
        Developer d = new Developer("Arjun", "Chennai", 90000);
        Programmer p = new Programmer("Neha", "Hyderabad", 80000);

        // Manager manages projects
        m.addProject("Website Revamp");
        m.addProject("Mobile App");

        // Developer tasks
        d.assignTask("API integration");
        d.assignTask("Unit tests");

        // Programmer fixes bugs
        p.fixBug();
        p.fixBug();

        // Print bonuses and reports
        System.out.println(m.name + " bonus = " + m.calculateBonus());
        System.out.println(d.name + " bonus = " + d.calculateBonus());
        System.out.println(p.name + " bonus = " + p.calculateBonus());

        System.out.println(m.performanceReport());
        System.out.println(d.performanceReport());
        System.out.println(p.performanceReport());
    }
}
