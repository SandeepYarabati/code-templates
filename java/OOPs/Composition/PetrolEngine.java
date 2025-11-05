package Composition;

public class PetrolEngine implements Engine {
    public void start() { System.out.println("Petrol Engine: Ignition ON"); }
    public void accelerate() { System.out.println("Petrol Engine: Fuel injected & revving"); }
    public void stop() { System.out.println("Petrol Engine: Ignition OFF"); }
}
