package foodDeliveryFactory;

public class CODPayment implements PaymentInterface{

	@Override
	public void pay() {
		System.out.println("paid by COD");
	}

}
