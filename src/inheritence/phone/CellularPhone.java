package inheritence.phone;

public class CellularPhone extends WirelessPhone {
    private boolean internetAccess;

    public CellularPhone(String brandName, int yearOfIssue, double batteryLifeTime, boolean internetAccess) {
        super(brandName, yearOfIssue, batteryLifeTime);
        internetAccess = this.internetAccess;
        System.out.println("Constructor from CelluralPhone class working..");
    }

    public boolean isInternetAccess() {
        return internetAccess;
    }

    public void setInternetAccess(boolean internetAccess) {
        this.internetAccess = internetAccess;
    }
}
