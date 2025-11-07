package OpenClosedPrinciple;

public class CashPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("Pay through cash");
	}
	
}
