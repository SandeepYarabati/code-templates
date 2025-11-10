package sol_OOPs;

class EmailNotification extends NotificationService {
    @Override
    public void send(NotificationData data) {
        System.out.println("Sending EMAIL to " + data.getTo() + ": " + data.getMessage());
    }
}
