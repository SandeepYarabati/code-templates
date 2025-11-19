package objectAdapter2;

public class SMSAdapter implements SMSService{
	private SMSProvider provider;
	
	

	public SMSAdapter(SMSProvider provider) {
		this.provider = provider;
	}



	@Override
	public void send(String msg, String mobileNo) {
		
		provider.submitSMS(new SMSPayload(msg + " to " + mobileNo));
		
	}

}
