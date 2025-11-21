package miniLLD;

public class SmsFactory implements NotificationFactory{

	@Override
	public NotificationSender createNotificationSender() {
		return new SMSSender();
	}

}
