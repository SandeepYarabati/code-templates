package factoryMethodPattern;

public class Uber {
	public static void main(String[] args) {
		Transportfactory carfactory = new Carfactory();
		Transportfactory bikeFactory = new BikeFactory();
		Transportfactory autoFactory = new AutoFactory();
		
		Transport car = carfactory.createTransport();
		Transport bike = bikeFactory.createTransport();
		Transport auto = autoFactory.createTransport();
		
		car.book();
		bike.book();
		auto.book();
	}
}
