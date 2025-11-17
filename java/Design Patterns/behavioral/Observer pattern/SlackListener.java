package observerPattern;

public class SlackListener implements Observer{

	@Override
	public void update(String msg) {
		System.out.println("Slack:"+msg);
		
	}

}
