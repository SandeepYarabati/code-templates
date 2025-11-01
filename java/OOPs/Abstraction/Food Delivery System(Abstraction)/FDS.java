package FoodDeliverySystem;

public class FDS {

	public static void main(String[] args) {
	    FoodItem meals = new Meals("Normal Thali", 100);
	    FoodItem biryani = new Biryani("Hyderabadi Dum Biryani", 300);

	    meals.checkVegOrNonVeg();
	    biryani.checkVegOrNonVeg();

	    DeliveryPartner swiggy = new Swiggy();
	    DeliveryPartner zomato = new Zomato();

	    int swiggyCoupon = swiggy.applyCoupon();
	    int zomatoCoupon = zomato.applyCoupon();

	    DeliveryPartner bestPartner = (swiggyCoupon > zomatoCoupon) ? swiggy : zomato;

	    System.out.println("Best coupon from: " + bestPartner.getClass().getSimpleName());
	    bestPartner.order(meals);
	    bestPartner.order(biryani);
	}


}
