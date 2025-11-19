package adapterPattern;

public class AppTest {
	public static void main(String[] args) {
		NotificationManager nm = new NotificationManager(new GmailAdapter(new GmailAPI()));
		
		nm.sendNotificationEmail("s@gmail.com", "Request", "PLease do");
		
		NotificationManager nm2 = new NotificationManager(new OutlookAdapter(new OutlookAPI()));
		nm2.sendNotificationEmail("a@outlook.com", "order", "Do it by  EOD");
	}
}
