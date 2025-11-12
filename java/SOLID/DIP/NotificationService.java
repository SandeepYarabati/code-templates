package DIP;

public class NotificationService {
	private notification notification;

	public NotificationService(DIP.notification notification) {
		this.notification = notification;
	}
	void Notify() {
		notification.sendMessage();
	}
}
