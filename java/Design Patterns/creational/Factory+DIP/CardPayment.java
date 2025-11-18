package foodDeliveryFactory;

public class CardPayment implements PaymentInterface{

	@Override
	public void pay() {
		System.out.println("paid by card");
	}

}
