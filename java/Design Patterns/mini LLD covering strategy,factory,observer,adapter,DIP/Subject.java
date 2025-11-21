package miniLLD;

import observerPattern.Observer;

public interface Subject {
	void register(NotificationSender o);
	void unregister(NotificationSender o);
	void notifySenders();
}
