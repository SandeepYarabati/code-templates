package FoodDeliverySystem;

public class CreditCard implements Payment{

	@Override
	public void refund() {
		System.out.println("payment cannot be refunded!");
		
	}

}
