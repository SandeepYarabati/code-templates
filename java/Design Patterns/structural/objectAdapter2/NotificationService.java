package objectAdapter2;

public class NotificationService {
	private SMSService smsService;

	public NotificationService(SMSService smsService) {
		super();
		this.smsService = smsService;
	}
	void notifyUser(String msg, String mobile) {
		smsService.send(msg, mobile);
	}
}
