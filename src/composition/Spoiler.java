package composition;

public class Spoiler {
    String colour;

    public Spoiler(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Spoiler{" +
                "colour='" + colour + '\'' +
                '}';
    }
}