// Employee.java
abstract class employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + baseSalary);
    }

    public abstract double calculateSalary();
}

// Department.java
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// FullTimeEmployee.java
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // fixed salary
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// PartTimeEmployee.java
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, hoursWorked * hourlyRate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// MainEmployeeManagement.java
import java.util.*;

public class MainEmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f1 = new FullTimeEmployee(101, "Alice", 50000);
        PartTimeEmployee p1 = new PartTimeEmployee(102, "Bob", 100, 200);

        f1.assignDepartment("HR");
        p1.assignDepartment("IT");

        employees.add(f1);
        employees.add(p1);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Department: " + ((Department) e).getDepartmentDetails());
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println("--------------");
        }
    }
}
