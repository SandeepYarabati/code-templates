package factoryMethodPattern;

public class Pushfactory implements NotificationFactory{

	@Override
	public NotificationSender create() {
		// TODO Auto-generated method stub
		return new Push();
	}

}
