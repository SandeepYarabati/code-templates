package Inheritance;

public class Truck extends Vehicle{
	void loadingCapacity() {
		System.out.println("10 Ton");
	}
	void fueltype() {
		System.out.println("Diesel");
	}
	
	void refuel(int litres) {
		System.out.println("Added "+litres+" litres of fuel");
	}
	
	void refuel(int litres, boolean premium) {
		if(premium) {
			System.out.println("Added "+litres+" litres of premium fuel");
		}else {
			System.out.println("Added "+litres+" litres of normal fuel");
		}
	}
}
