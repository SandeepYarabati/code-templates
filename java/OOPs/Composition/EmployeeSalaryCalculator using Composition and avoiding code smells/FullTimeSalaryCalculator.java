package EmployeeSalaryCalculator;

public class FullTimeSalaryCalculator implements SalaryCalculator{

	@Override
	public Double calculateSalary(Employee e) {
		 return e.getBaseSalary() + e.getBonus() - e.getTax();
	}

}
