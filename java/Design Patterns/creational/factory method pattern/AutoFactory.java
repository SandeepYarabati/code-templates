package factoryMethodPattern;

public class AutoFactory extends Transportfactory{

	@Override
	Transport createTransport() {
		// TODO Auto-generated method stub
		return new Auto();
	}
	
}
