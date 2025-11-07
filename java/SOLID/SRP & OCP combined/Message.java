package SrpOcp;

public class Message {
	public static void main(String[] args) {
		NotificationService emailNotification = new NotificationService(
                new EmailFormatter(),
                new EmailSender(),
                new DBLogger()
        );

        emailNotification.notify("Payment Successful!");
	}
}
