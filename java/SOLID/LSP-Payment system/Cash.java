package paymentSystem;

public class Cash implements Refundable,Payable,Confirmable{

	@Override
	public void pay() {
		System.out.println("pay by cash");
		
	}

	

	@Override
	public void refund() {
		System.out.println("refund initiated for cash payment");
		
	}



	@Override
	public void confirmPayment() {
		System.out.println("Payment done through cash");
		
	}

}
