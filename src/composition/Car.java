package composition;

public class Car implements CarRun {
    Engine engine;
    Wheel[] wheel;
    Handlebar handlebar;

    public Car(Engine engine, Wheel[] wheel, Handlebar handlebar) {
        this.engine = engine;
        this.wheel = wheel;
        this.handlebar = handlebar;
    }


    @Override
    public void carRun() {
        System.out.println("We start the engine, the wheels are spinning, " +
                "the steering wheel is spinning, the car is moving ..");
    }
}
