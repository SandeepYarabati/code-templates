package observerPattern;

public class PushNotificationListener implements Observer{

	@Override
	public void update(String msg) {
		System.out.println("PushNotification:"+msg);
		
	}

}
