package EmploymentManagementSystem;

public class FullTimeEmployee extends Employee {

    @Override
    void shift() {
        System.out.println("10 hour shift");
    }

    @Override
    void workMode() {
        System.out.println("Full-time work");
    }

    @Override
    double calculateSalary() {
        return 30000;
    }

    double calculateSalary(double bonus) {  // Overloading
        return 30000 + bonus;
    }
}
