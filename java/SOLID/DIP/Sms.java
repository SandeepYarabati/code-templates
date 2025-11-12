package DIP;

public class Sms implements notification{

	@Override
	public void sendMessage() {
		System.out.println("SMS:message sent");
		
	}

}
