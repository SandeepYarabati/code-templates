package factoryMethodPattern;

public class SmsFactory implements NotificationFactory{

	@Override
	public NotificationSender create() {
		// TODO Auto-generated method stub
		return new Sms();
	}

}
