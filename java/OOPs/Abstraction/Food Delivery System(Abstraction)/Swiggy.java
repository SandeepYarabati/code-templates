package FoodDeliverySystem;

public class Swiggy implements DeliveryPartner{

	@Override
	public int applyCoupon() {
		System.out.println("10% discount applied");
		return 10;
	}

}
