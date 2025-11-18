package factoryMethodPattern;

public class MessageSender {
	public static void main(String[] args) {
		NotificationFactory emailFactory = new EmailFactory();
		NotificationFactory smsfactory = new SmsFactory();
		NotificationFactory pushFactory = new Pushfactory();
		
		NotificationSender email = emailFactory.create();
		NotificationSender sms = smsfactory.create();
		NotificationSender push = pushFactory.create();
		
		email.send();
		sms.send();
		push.send();
	}
}
