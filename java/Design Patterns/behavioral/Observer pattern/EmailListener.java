package observerPattern;

public class EmailListener implements Observer{

	@Override
	public void update(String msg) {
		System.out.println("Email:"+msg);
		
	}

}
