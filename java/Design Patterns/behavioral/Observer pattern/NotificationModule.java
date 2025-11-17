package observerPattern;

public class NotificationModule {
	public static void main(String[] args) {
		NotificationCenter nc = new NotificationCenter();
		nc.register(new EmailListener());
		nc.register(new SmsListener());
		nc.register(new SlackListener());
		nc.register(new WhatsappListener());
		nc.register(new PushNotificationListener());
		nc.setMessage("hello there");
		
	}
}
