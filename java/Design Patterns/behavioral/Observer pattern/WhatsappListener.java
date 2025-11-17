package observerPattern;

public class WhatsappListener implements Observer{

	@Override
	public void update(String msg) {
		System.out.println("Whatsapp:"+msg);
		
	}

}
