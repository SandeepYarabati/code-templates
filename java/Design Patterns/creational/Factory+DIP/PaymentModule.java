package foodDeliveryFactory;

public class PaymentModule {

	public static void main(String[] args) {
		OrderService card = new OrderService(new CardPaymentFactory());
		card.payAmount();

		OrderService upi = new OrderService(new UPIPaymentFactory());
		OrderService cod = new OrderService(new CODPaymentFactory());
		
		upi.payAmount();
		cod.payAmount();
	}

}
