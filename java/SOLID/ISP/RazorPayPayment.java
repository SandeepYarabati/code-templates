package ISP;

public class RazorPayPayment implements cardPayment,UPIPayment,refundable{

	@Override
	public void refund() {
		System.out.println("razor refund");
		
	}

	@Override
	public void payWithUPI() {
		System.out.println("RAzor:upi");
		
	}

	@Override
	public void payWithCreditCard() {
		System.out.println("RAzor:credit");
		
	}

	@Override
	public void payWithCrDebitCard() {
		System.out.println("RAzor:debit");
		
	}

}
