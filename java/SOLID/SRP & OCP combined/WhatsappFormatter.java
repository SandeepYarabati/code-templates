package SrpOcp;

public class WhatsappFormatter implements MessageFormatter {
    public String format(String message) {
        return "WhatsApp Msg: " + message;
    }
}