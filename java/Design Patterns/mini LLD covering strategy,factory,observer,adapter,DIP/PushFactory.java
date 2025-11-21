package miniLLD;

public class PushFactory implements NotificationFactory{

	@Override
	public NotificationSender createNotificationSender() {
		return new PushSender();
	}

}
