package factoryMethodPattern;

public class Carfactory extends Transportfactory{

	@Override
	Transport createTransport() {
		// TODO Auto-generated method stub
		return new Car();
	}
	
}
