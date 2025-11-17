package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationCenter implements Subject{
	private List<Observer> observers = new ArrayList<>();
	private String message;
	

	public void setMessage(String message) {
		this.message = message;
		notifyObservers();
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(message);
		}
		
	}

}
