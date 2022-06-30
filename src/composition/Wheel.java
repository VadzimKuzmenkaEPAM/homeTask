package composition;

public class Wheel {
    private String sideAndPosition;

    public Wheel(String sideAndPosition) {
        this.sideAndPosition = sideAndPosition;
    }

    public String getSideAndPosition() {
        return sideAndPosition;
    }

    public void setSideAndPosition(String sideAndPosition) {
        this.sideAndPosition = sideAndPosition;
    }
}
