package miniLLD;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject{
	private List<NotificationSender> senders = new ArrayList<>();
	private String message;
	
	

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void register(NotificationSender o) {
			senders.add(o);
		
	}

	@Override
	public void unregister(NotificationSender o) {
		senders.remove(0);
		
	}

	@Override
	public void notifySenders() {
		for (NotificationSender s : senders) {
			s.send(message);
		}
		
	}

}
