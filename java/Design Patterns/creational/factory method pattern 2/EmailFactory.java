package factoryMethodPattern;

public class EmailFactory implements NotificationFactory{

	@Override
	public NotificationSender create() {
		// TODO Auto-generated method stub
		return new Email();
	}

}
