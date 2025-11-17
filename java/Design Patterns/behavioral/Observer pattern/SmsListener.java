package observerPattern;

public class SmsListener implements Observer{

	@Override
	public void update(String msg) {
		System.out.println("SMS:"+msg);
		
	}

}
