package LSP;

public class Penguin implements NonFlyable,Walkable{

	@Override
	public void walk() {
		System.out.println("penguin walking");
		
	}

	@Override
	public void cantFly() {
		System.out.println("yes penguin cant fly");
		
	}

}
