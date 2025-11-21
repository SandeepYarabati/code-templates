package miniLLD;

public class SMSSender implements NotificationSender{

	@Override
	public void send(String msg) {
		System.out.println("SMS sent:"+msg);
		
	}
	
}
