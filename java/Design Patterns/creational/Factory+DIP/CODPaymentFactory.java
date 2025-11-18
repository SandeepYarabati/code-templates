package foodDeliveryFactory;

public class CODPaymentFactory implements PaymentFactory{

	@Override
	public PaymentInterface create() {
		return new CODPayment();
	}

}
