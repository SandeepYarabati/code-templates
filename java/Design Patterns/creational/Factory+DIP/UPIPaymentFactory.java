package foodDeliveryFactory;

public class UPIPaymentFactory implements PaymentFactory{

	@Override
	public PaymentInterface create() {
		return new UPIPayment();
	}

}
