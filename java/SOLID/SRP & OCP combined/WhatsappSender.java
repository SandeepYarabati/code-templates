package SrpOcp;

public class WhatsappSender implements MessageSendder {
    public void send(String formattedMessage) {
        System.out.println("Sending WhatsApp → " + formattedMessage);
    }
}