package miniLLD;

public class EmailFactory implements NotificationFactory{

	@Override
	public NotificationSender createNotificationSender() {
		return new EmailSender();
	}

}
