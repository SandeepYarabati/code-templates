package sol_OOPs;

class NotificationSender {
    public void sendNotification(NotificationService service, NotificationData data) {
        service.send(data);
    }
}