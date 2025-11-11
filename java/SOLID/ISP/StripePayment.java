package ISP;

public class StripePayment implements cardPayment,refundable{

	@Override
	public void refund() {
		System.out.println("Stripe:amount refunded");
		
	}


	@Override
	public void payWithCreditCard() {
		System.out.println("Stripe:Credit card pay");
		
	}

	@Override
	public void payWithCrDebitCard() {
		System.out.println("Stripe:DebitCard pay");
		
	}

}
