package composition;

public class Handlebar {
    private String color;

    public Handlebar(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Handlebar{" +
                "color='" + color + '\'' +
                '}';
    }
}
