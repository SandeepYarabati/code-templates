package EmployeeSalaryCalculator;

public class Organization {
	public static void main(String[] args) {
		Employee sandeep = new Employee(new PartTimeSalaryCalculator());
		Employee venu = new Employee(new FullTimeSalaryCalculator());
		Employee shri = new Employee(new ContractBasedSalaryCalculator());
		
		
		sandeep.setHoursWorked(100);
		sandeep.setHourlyRate(100);
		sandeep.setTax(2000);
		
		venu.setBaseSalary(25000);
		venu.setBonus(5000);
		venu.setTax(2000);
		
		shri.setBaseSalary(10000);
		
		System.out.println(sandeep.calculateSalary());
		System.out.println(venu.calculateSalary());
		System.out.println(shri.calculateSalary());
	}
}
