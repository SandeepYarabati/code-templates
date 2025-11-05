package EmployeeSalaryCalculator;

public class ContractBasedSalaryCalculator implements SalaryCalculator{

	@Override
	public Double calculateSalary(Employee e) {
		return e.getBaseSalary();
	}
	
}
