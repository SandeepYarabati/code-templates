package FoodDeliverySystem;

public interface DeliveryPartner {
	
	
	 int applyCoupon();
	
	default void order(FoodItem item) {
		System.out.println(item +":order accepted");
	}

}
