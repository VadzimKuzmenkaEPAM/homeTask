package composition;

public class Car implements CarRun {
    Spoiler spoiler; // for agregatiom
    Engine engine = new Engine(1.5, 200, "Audi"); //
    Wheel[] wheel = { new Wheel("front right"), //
            new Wheel("front left"), //
            new Wheel("rear right"), //
            new Wheel("rear left")}; //
    Handlebar handlebar = new Handlebar("Black"); // composition

    public Car(Spoiler spoiler) {
        this.spoiler = spoiler;
    } // for agregation

    public Car() { // for composition
    }

    @Override
    public void carRun() {
        System.out.println("We start the engine, the wheels are spinning, " +
                "the steering wheel is spinning, the car is moving ..");
    }
}
