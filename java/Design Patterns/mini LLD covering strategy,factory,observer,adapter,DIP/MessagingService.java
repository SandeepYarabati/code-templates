package miniLLD;

public class MessagingService {
	public static void main(String[] args) {
		NotificationService ns = new NotificationService();
		ns.register(new gmailAdapter(new gmailAPI()));
		ns.register(new PushSender());
		ns.register(new SMSSender());
		
		ns.setMessage("Hi every one");
		ns.notifySenders();
	}
}
