package EmploymentManagementSystem;

public class PartTimeEmployee extends Employee {

    @Override
    void shift() {
        System.out.println("Irregular timings");
    }

    @Override
    void workMode() {
        System.out.println("Part-time work");
    }

    @Override
    double calculateSalary() {
        return 1000 * 4; // Example: 4 hours/day * ₹1000
    }
}
