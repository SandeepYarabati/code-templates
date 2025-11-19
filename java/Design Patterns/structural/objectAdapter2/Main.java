package objectAdapter2;

public class Main {
	public static void main(String[] args) {
		NotificationService ns = new NotificationService(new SMSAdapter(new SMSProvider()));
		
		ns.notifyUser("your recgarge is expired", "9009900999");
	}
}
