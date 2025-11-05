package Composition;

public class ElectricEngine implements Engine {
    public void start() { System.out.println("Electric Engine: Power ON"); }
    public void accelerate() { System.out.println("Electric Engine: Supplying battery power"); }
    public void stop() { System.out.println("Electric Engine: Power OFF"); }
}
