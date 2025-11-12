package DIP;

public class Slack implements notification{

	@Override
	public void sendMessage() {
		System.out.println("Slack:message sent");
		
	}

}
