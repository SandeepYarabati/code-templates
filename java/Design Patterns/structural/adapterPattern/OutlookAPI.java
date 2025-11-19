package adapterPattern;

public class OutlookAPI {
	void outlookSend(String to, String subject, String message) {
		System.out.println("message sent through outlook:"+message);
	}
}
