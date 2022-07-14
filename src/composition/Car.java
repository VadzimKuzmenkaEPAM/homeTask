package composition;

import java.util.Arrays;

public class Car implements Runnable {
    Spoiler spoiler;  // aggregation
    private final Engine engine = new Engine(1.5, 200, "Audi"); // composition
    Wheel[] wheel; // aggregation
    Handlebar handlebar; // aggregation

    public Car(Spoiler spoiler, Wheel[] wheel, Handlebar handlebar) { // aggregation
        this.spoiler = spoiler;
        this.wheel = wheel;
        this.handlebar = handlebar;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public void runCar() {
        System.out.println("We start the engine, the wheels are spinning, " +
                "the steering wheel is spinning, the car is moving ..");
    }

    @Override
    public String toString() {
        return "Car{" +
                "spoiler=" + spoiler +
                ", engine=" + engine +
                ", wheel=" + Arrays.toString(wheel) +
                ", handlebar=" + handlebar +
                '}';
    }
}