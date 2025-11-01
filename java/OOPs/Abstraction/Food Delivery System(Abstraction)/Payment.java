package FoodDeliverySystem;

public interface Payment {
	
	default void pay() {
		System.out.println("amount paid successfully");
	}
	
	void refund();

}
