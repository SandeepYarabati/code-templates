package adapterPattern;

public class GmailAdapter implements EmailService{
	private GmailAPI gmailAPI;

	public GmailAdapter(GmailAPI gmailAPI) {
		this.gmailAPI = gmailAPI;
	}

	@Override
	public void send(String to, String subject, String message) {
		gmailAPI.gmailSend(to, subject, message);
	}
	

}
