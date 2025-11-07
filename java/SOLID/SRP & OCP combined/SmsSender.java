package SrpOcp;

public class SmsSender implements MessageSendder {
    public void send(String formattedMessage) {
        System.out.println("Sending SMS → " + formattedMessage);
    }
}
