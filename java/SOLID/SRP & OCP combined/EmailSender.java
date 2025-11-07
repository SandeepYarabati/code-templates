package SrpOcp;

public class EmailSender implements MessageSendder {
    public void send(String formattedMessage) {
        System.out.println("Sending Email → " + formattedMessage);
    }
}
