package inheritence.phone;

public class WirelessPhone extends Phone {
    private static double batteryLifeTime;

    static {
        batteryLifeTime = 150;
        System.out.println("static block from WirelessPhone class Working..");
    }

    public WirelessPhone(String brandName, int yearOfIssue, double batteryLifeTime) {
        super(brandName, yearOfIssue);
        batteryLifeTime = this.batteryLifeTime;
        System.out.println("Constructor from WirelessPhone class working..");
    }

    public double getBatteryLifeTime() {
        return batteryLifeTime;
    }

    public void setBatteryLifeTime(double batteryLifeTime) {
        this.batteryLifeTime = batteryLifeTime;
    }
}
