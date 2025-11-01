package test;

public class Garage {
	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		bike.start();
		bike.fuelType();
		bike.stop();
		
		car.start();
		car.fuelType();
		car.stop();
	}
}
