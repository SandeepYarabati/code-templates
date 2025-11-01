package test;

public class CreditCard implements PaymentGateway{

	@Override
	public void refund() {
		System.out.println("payment cannot be refunded!");
		
	}

}
