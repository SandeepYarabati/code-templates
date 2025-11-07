package paymentSystem;

public class CreditCard implements Payable,Confirmable{

	@Override
	public void pay() {
		System.out.println("pay by credit card");
		
	}

	@Override
	public void confirmPayment() {
		System.out.println("Payment done through credit card");
		
	}

}
