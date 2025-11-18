package foodDeliveryFactory;

public class UPIPayment implements PaymentInterface{

	@Override
	public void pay() {
		System.out.println("paid by UPI");
	}

}
