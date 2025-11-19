package objectAdapter2;

public class SMSProvider {
	void submitSMS(SMSPayload payload) {
		System.out.println("message:"+payload.getMsg()+" sent successfully by provider");
	}
}
