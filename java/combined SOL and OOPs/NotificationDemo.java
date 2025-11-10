package sol_OOPs;

public class NotificationDemo {
    public static void main(String[] args) {
        NotificationSender sender = new NotificationSender();

        NotificationData data = new NotificationData("9999999999", "Your payment is successful!");

        sender.sendNotification(new EmailNotification(), data);
        sender.sendNotification(new SMSNotification(), data);
        sender.sendNotification(new WhatsAppNotification(), data);
    }
}

