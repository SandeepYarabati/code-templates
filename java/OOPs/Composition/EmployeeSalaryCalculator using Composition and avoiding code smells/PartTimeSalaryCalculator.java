package EmployeeSalaryCalculator;

public class PartTimeSalaryCalculator implements SalaryCalculator{

	@Override
	public Double calculateSalary(Employee e) {
		return (e.getHoursWorked() * e.getHourlyRate()) - e.getTax();
	}

}
