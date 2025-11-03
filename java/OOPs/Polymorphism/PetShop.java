package Polymorphism;

public class PetShop {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.speak();
		cat.speak();
	}

}
