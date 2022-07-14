package inheritence.phone;
//create an inheritance hierarchy from the "phone" class, add static and non-static blocks to classes
// and logs to class constructors
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