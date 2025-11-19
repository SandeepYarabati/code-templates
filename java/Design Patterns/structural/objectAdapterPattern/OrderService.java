package objectAdapterPattern;

public class OrderService {
	private PaymentGateway paymentGateway;

	public OrderService(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	void placeOrder(int amount) {
		paymentGateway.pay(amount);
	}
}
