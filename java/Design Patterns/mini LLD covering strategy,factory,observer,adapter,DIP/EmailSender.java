package miniLLD;

public class EmailSender implements NotificationSender{

	@Override
	public void send(String msg) {

		System.out.println("Email sent:"+msg);
	}

}
