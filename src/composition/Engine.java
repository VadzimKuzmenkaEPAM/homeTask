package composition;

public class Engine {
    private double volume;
    private int power;
    private String brandName;

    public Engine(double volume, int power, String brandName) {
        this.volume = volume;
        this.power = power;
        this.brandName = brandName;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power='" + power + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}