package SrpOcp;

public class NotificationService {
    
    private MessageFormatter formatter;
    private MessageSendder sender;
    private NotificationLogger logger;

    public NotificationService(MessageFormatter formatter, MessageSendder sender, NotificationLogger logger) {
        this.formatter = formatter;
        this.sender = sender;
        this.logger = logger;
    }

    public void notify(String message) {
        String formattedMessage = formatter.format(message);
        sender.send(formattedMessage);
        logger.log(formattedMessage);
    }
}
