import composition.*;
      /*  Create a car class, which will consist of the
        required car attributes (motor, steering wheel, wheels, etc.), for this, use composition.
        Also add the ability to create a car with a spoiler (use aggregation). Add a
        interface with "Run" method .*/
public class Main {
    public static void main(String[] args) {
        Disc disc = new Disc("Michelin");
        Tire tire = new Tire("Continental");
        Wheel[] wheel = {new Wheel(disc, tire, "front right"),
                new Wheel(disc, tire,"front left"),
                new Wheel(disc, tire,"rear right"),
                new Wheel(disc, tire,"rear left")};
        Car car = new Car (new Spoiler("Black"), wheel, new Handlebar("Black"));
        car.runCar();
        System.out.println(car.getEngine()); // aggregation
        System.out.println(car);
    }
}