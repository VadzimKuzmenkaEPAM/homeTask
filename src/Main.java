import composition.*;
      /*  Create a car class, which will consist of the
        required car attributes (motor, steering wheel, wheels, etc.), for this, use composition.
        Also add the ability to create a car with a spoiler (use aggregation). Add a
        interface with "Run" method .*/


public class Main {
    public static void main(String[] args) {

        Car car = new Car ();
        car.carRun(); // composition

        Car carWithSpoiler = new Car(new Spoiler("Black")); // agregation
        carWithSpoiler.carRun();
    }
}
