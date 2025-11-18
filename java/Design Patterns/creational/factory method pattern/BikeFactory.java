package factoryMethodPattern;

public class BikeFactory extends Transportfactory{

	@Override
	Transport createTransport() {
		// TODO Auto-generated method stub
		return new Bike();
	}
	
}
