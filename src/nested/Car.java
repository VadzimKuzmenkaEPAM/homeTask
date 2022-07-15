package nested;

public class Car {
    private String colour;
    private static String carCondition;
    private Engine engine;
    private GasTank gasTank;

    public Car(String colour, String carCondition, Engine engine, int value) {
        this.colour = colour;
        Car.carCondition = carCondition;
        this.engine = engine;
        this.gasTank = this.new GasTank(value);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static String getCarCondition() {
        return carCondition;
    }

    public static void setCarCondition(String carCondition) {
        Car.carCondition = carCondition;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", carCondition=" + carCondition +
                ", engine=" + engine +
                ", gasTank=" + gasTank +
                '}';
    }

    public static class Engine { // static Nested class
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public void printInfo() {
            System.out.println("horsePower -> " + horsePower + " car condition ->" + carCondition); // we can have access only to static fields
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

class Main {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(299);
        Car car = new Car("Black ", "new", engine, 200);
        engine.printInfo();
        System.out.println(car);
    }
}