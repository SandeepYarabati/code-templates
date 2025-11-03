package EmploymentManagementSystem;

public class Organisation {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        Employee e3 = new Intern();

        Employee[] employees = { e1, e2, e3 };

        for (Employee emp : employees) {
            emp.shift();
            emp.workMode();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("------------------------");
        }

        // Method Overloading example
        FullTimeEmployee fte = new FullTimeEmployee();
        System.out.println("FT Employee Salary with Bonus: " + fte.calculateSalary(8000));
    }
}
