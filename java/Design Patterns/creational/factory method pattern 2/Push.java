package factoryMethodPattern;

public class Push implements NotificationSender{

	@Override
	public void send() {
		System.out.println("Push sent");
		
	}

}
