package EmployeeSalaryCalculator;

public class Employee {
    private String name;
    private double baseSalary;
    private double bonus;
    private double tax;
    private double hoursWorked;
    private double hourlyRate;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}



	private SalaryCalculator salaryCalculator; // composition

    public Employee(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    public double calculateSalary() {
        return salaryCalculator.calculateSalary(this);
    }
}
