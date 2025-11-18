package foodDeliveryFactory;

public class CardPaymentFactory implements PaymentFactory{

	@Override
	public PaymentInterface create() {
		return new CardPayment();
	}

}
