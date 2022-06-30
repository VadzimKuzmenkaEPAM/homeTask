package Agregation;

public class Car {
    private String brandName;
    private String colour;

    public Car(String brandName, String colour) {
        this.brandName = brandName;
        this.colour = colour;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
