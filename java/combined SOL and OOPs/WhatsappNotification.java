package sol_OOPs;

class WhatsAppNotification extends NotificationService {
    @Override
    public void send(NotificationData data) {
        System.out.println("Sending WhatsApp message to " + data.getTo() + ": " + data.getMessage());
    }
}
