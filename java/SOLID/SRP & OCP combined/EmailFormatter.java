package SrpOcp;

public class EmailFormatter implements MessageFormatter {
    public String format(String message) {
        return "EMAIL TEMPLATE: " + message;
    }
}
