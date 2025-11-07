package SrpOcp;

public class SmsFormatter implements MessageFormatter {
    public String format(String message) {
        return "SMS: " + message;
    }
}
