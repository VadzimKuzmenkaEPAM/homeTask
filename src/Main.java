import composition.Car;
import composition.Engine;
import composition.Handlebar;
import composition.Wheel;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(1.8, 200, "Audi");
        Wheel[] wheels = new Wheel[]{
                new Wheel("front right"),
                new Wheel("front left"),
                new Wheel("rear right"),
                new Wheel("rear left")
        };
        Handlebar handlebar = new Handlebar("Black");
        Car car = new Car(engine, wheels, handlebar);
        car.carRun();
    }
}
