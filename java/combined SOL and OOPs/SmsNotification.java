package sol_OOPs;

class SMSNotification extends NotificationService {
    @Override
    public void send(NotificationData data) {
        System.out.println("Sending SMS to " + data.getTo() + ": " + data.getMessage());
    }
}