package adapterPattern;

public class OutlookAdapter implements EmailService{
	private OutlookAPI outlookAPI;

	public OutlookAdapter(OutlookAPI outlookAPI) {
		this.outlookAPI = outlookAPI;
	}

	@Override
	public void send(String to, String subject, String message) {

		outlookAPI.outlookSend(to, subject, message);
	}
	
}
