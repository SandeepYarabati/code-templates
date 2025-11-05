package Composition;

public class Car {

    private Engine engine;   // Composition

    public Car(Engine engine) {
        this.engine = engine;   // Inject dependency
    }

    void drive() {
        engine.start();
        engine.accelerate();
        engine.stop();
    }

    public static void main(String[] args) {
        Car tesla = new Car(new ElectricEngine());
        Car suzuki = new Car(new PetrolEngine());

        System.out.println("---- Driving Tesla ----");
        tesla.drive();

        System.out.println("\n---- Driving Suzuki ----");
        suzuki.drive();
    }
}
