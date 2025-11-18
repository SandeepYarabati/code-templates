package factoryMethodPattern;

public class Sms implements NotificationSender{

	@Override
	public void send() {
		System.out.println("Sms sent");
		
	}

}
