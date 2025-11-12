package DIP;

public class Email implements notification{

	@Override
	public void sendMessage() {
		System.out.println("EMAIL: message sent");
		
	}

}
