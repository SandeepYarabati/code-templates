package LSP;

public class Crow implements flyable,Walkable{

	@Override
	public void walk() {
		System.out.println("crow walking");
		
	}

	@Override
	public void fly() {
		System.out.println("crow flying");
		
	}

}
