package test;

public class GooglePay implements PaymentGateway{

	@Override
	public void refund() {
		System.out.println("refund initiated");
		
	}

}
