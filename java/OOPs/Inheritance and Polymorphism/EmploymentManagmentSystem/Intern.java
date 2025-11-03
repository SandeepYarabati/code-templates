package EmploymentManagementSystem;

public class Intern extends Employee {

    @Override
    void shift() {
        System.out.println("4 hour shift");
    }

    @Override
    void workMode() {
        System.out.println("Intern - Learning and assisting");
    }

    @Override
    double calculateSalary() {
        return 10000; 
    }
}
