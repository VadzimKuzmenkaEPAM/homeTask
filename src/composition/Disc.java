package composition;

public class Disc {
    private String brand;

    public Disc(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "brand='" + brand + '\'' +
                '}';
    }
}