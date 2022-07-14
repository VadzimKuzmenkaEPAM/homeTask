package composition;

public class Wheel {
    Disc disc;
    Tire tire;
    private String sideAndPosition;

    public Wheel(Disc disc, Tire tire, String sideAndPosition) {
        this.disc = disc;
        this.tire = tire;
        this.sideAndPosition = sideAndPosition;
    }

    public Disc getDisc() {
        return disc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getSideAndPosition() {
        return sideAndPosition;
    }

    public void setSideAndPosition(String sideAndPosition) {
        this.sideAndPosition = sideAndPosition;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "disc=" + disc +
                ", tire=" + tire +
                ", sideAndPosition='" + sideAndPosition + '\'' +
                '}';
    }
}