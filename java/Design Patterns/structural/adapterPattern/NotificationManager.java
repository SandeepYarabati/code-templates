package adapterPattern;

public class NotificationManager {
	private EmailService emailService;

	public NotificationManager(EmailService emailService) {
		this.emailService = emailService;
	}
	void sendNotificationEmail(String to,String subject, String message) {
		emailService.send(to, subject, message);
	}

}
