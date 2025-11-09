package com.company.main;

// single import and on-demand import example
import com.company.hr.Employee;
import com.company.payroll.*;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Aby", "Engineering", 50000);
        System.out.println("Before bonus: " + emp);

        Payroll payroll = new Payroll();
        double salaryAfterBonus = payroll.calculateBonus(emp);

        System.out.println("After bonus salary: " + salaryAfterBonus);
    }
}
