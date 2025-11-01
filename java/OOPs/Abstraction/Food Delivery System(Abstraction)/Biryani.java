package FoodDeliverySystem;

public class Biryani extends FoodItem{

	public Biryani(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void checkVegOrNonVeg() {
		System.out.println("NonVeg");
		
	}

}
