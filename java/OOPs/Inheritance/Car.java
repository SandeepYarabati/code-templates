package Inheritance;

public class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("started car with smooth sound!");
	}
	public void fuelType() {
		System.out.println("petrol");
	}
	
	void loadingCapacity() {
		System.out.println("1 Ton");
	}
}
