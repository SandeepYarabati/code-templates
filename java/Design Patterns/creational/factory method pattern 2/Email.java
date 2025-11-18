package factoryMethodPattern;

public class Email implements NotificationSender{

	@Override
	public void send() {
		System.out.println("email sent");
		
	}

}
