package LSP;

public class BirdSanctuary {
	public static void main(String[] args) {
		Penguin penguin = new Penguin();
		Crow crow = new Crow();
		
		penguin.cantFly();
		penguin.walk();
		
		crow.fly();
		crow.walk();
	}
}
