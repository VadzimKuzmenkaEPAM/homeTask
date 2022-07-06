package nested;

public class Car {
    String colour;
    int doorCount;
    Engine engine;
    GasTank gasTank;

    public Car(String colour, int doorCount, Engine engine, int value) {
        this.colour = colour;
        this.doorCount = doorCount;
        this.engine = engine;
        this.gasTank = this.new GasTank(value);
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                ", gasTank=" + gasTank +
                '}';
    }

    public static class Engine { // static Nested class
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public class GasTank { // Inner class
        private int value;

        public GasTank(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "gasTank{" +
                    "value=" + value +
                    '}';
        }
    }
}
    class Test {
        public static void main(String[] args) {
            Car.Engine engine = new Car.Engine(299);
            Car car = new Car("Black", 2, engine, 200);



            System.out.println(car);
        }
    }

