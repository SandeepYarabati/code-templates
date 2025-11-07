package OpenClosedPrinciple;

public class PaymentService {
	private Payment payment;

	public PaymentService(Payment payment) {
		this.payment = payment;
	}
	
	void payAmount() {
		payment.pay();
	}
}
