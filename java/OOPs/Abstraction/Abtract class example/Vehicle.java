package test;

abstract class Vehicle {
	abstract void fuelType();
	void start() {
		System.out.println("engine starts");
	}
	void stop() {
		System.out.println("engine stops");
	}
}
