package FoodDeliverySystem;

public class Zomato implements DeliveryPartner{

	@Override
	public int applyCoupon() {
		System.out.println("Currently no discounts");
		return 0;
	}

}
