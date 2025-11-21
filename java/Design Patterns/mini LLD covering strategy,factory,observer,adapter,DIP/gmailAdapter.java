package miniLLD;

import adapterPattern.GmailAPI;

public class gmailAdapter implements NotificationSender{
	private gmailAPI gmailApi;
	
	
	public gmailAdapter(gmailAPI gmailApi) {
		this.gmailApi = gmailApi;
	}


	@Override
	public void send(String msg) {
		gmailApi.sendGmail(msg);
		
	}
	
}
