package FoodDeliverySystem;

abstract class FoodItem {
	private String name;
	private int price;
	public FoodItem(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	void order() {
		System.out.println("food:"+name+" is ordered");
	}
	abstract void checkVegOrNonVeg();
}
