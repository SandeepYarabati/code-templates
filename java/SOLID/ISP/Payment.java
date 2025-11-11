package ISP;

public class Payment {
	public static void main(String[] args) {
		cardPayment card = new StripePayment();
		UPIPayment upi = new PhonePepayment();
		refundable refund = new RazorPayPayment();
		
		card.payWithCrDebitCard();
		card.payWithCreditCard();
		
		upi.payWithUPI();
		
		refund.refund();
	}
}
