package miniLLD;

public class PushSender implements NotificationSender{

	@Override
	public void send(String msg) {
		System.out.println("Push Sent:"+msg);
		
	}

}
