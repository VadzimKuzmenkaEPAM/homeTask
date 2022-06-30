package inheritence.phone;

public class WirelessPhone extends Phone {
    private double batteryLifeTime;

    public WirelessPhone(String brandName, int yearOfIssue, double batteryLifeTime) {
        super(brandName, yearOfIssue);
        batteryLifeTime = this.batteryLifeTime;
    }

    public double getBatteryLifeTime() {
        return batteryLifeTime;
    }

    public void setBatteryLifeTime(double batteryLifeTime) {
        this.batteryLifeTime = batteryLifeTime;
    }
}
