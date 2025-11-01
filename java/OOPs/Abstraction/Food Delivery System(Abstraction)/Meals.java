
package FoodDeliverySystem;

public class Meals extends FoodItem{

	public Meals(String name, int price) {
		super(name, price);
	}

	@Override
	void checkVegOrNonVeg() {
		System.out.println("Veg");
		
	}

}
