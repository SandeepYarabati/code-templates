package Inheritance;

public class Highway {
	public static void main(String[] args) {
		Car car = new Car();
		Truck truck = new Truck();
		
		car.start();
		car.stop();
		car.brake();
		car.fuelType();
		car.loadingCapacity();
		
		truck.start();
		truck.stop();
		truck.loadingCapacity();
		truck.fueltype();
			
		truck.refuel(5);
		truck.refuel(5,false);
		truck.refuel(10,true);
		
		car.start();
	}
}
