package composition;

public class Tire {
    private String brandName;

    public Tire(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}