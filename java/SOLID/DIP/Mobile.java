package DIP;

public class Mobile {
	public static void main(String[] args) {
		notification email = new Email();
		notification slack = new Slack();
		notification sms = new Sms();
		notification whatsapp = new Whatsapp();
		
		email.sendMessage();
		slack.sendMessage();
		sms.sendMessage();
		whatsapp.sendMessage();
		
	}
}
