package foodDeliveryFactory;

public class OrderService {
	private PaymentFactory paymentFactory;

	public OrderService(PaymentFactory paymentFactory) {
		this.paymentFactory=paymentFactory;
	}
	
	void payAmount() {
		PaymentInterface pi = paymentFactory.create();
		pi.pay();
	}

}
