package SrpOcp;

public class DBLogger implements NotificationLogger {
    public void log(String message) {
        System.out.println("Logged to DB: " + message);
    }
}
