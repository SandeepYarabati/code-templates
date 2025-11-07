package OpenClosedPrinciple;

public class CreditCardPayment implements Payment{

	@Override
	public void pay() {

		System.out.println("Pay through CreditCard");
		
	}

}
