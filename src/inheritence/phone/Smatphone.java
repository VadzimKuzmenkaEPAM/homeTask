package inheritence.phone;

public class Smatphone extends CellularPhone {
    private static String operatingSystem;
    private double cameraMegapixel;

   static  {
        operatingSystem = "Android";
        System.out.println("static block from class Smartphone Working..");
    }

    {
        cameraMegapixel = 150;
        System.out.println("non-static block from Smartphone class is working");
    }


    public Smatphone(String brandName, int yearOfIssue, double batteryLifeTime,
                     boolean internetAccess, String operatingSystem, double cameraMegapixel) {
        super(brandName, yearOfIssue, batteryLifeTime, internetAccess);
        operatingSystem = this.operatingSystem;
        cameraMegapixel = this.cameraMegapixel;
        System.out.println("Constructor from smartphone class working..");
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getCameraMegapixel() {
        return cameraMegapixel;
    }

    public void setCameraMegapixel(double cameraMegapixel) {
        this.cameraMegapixel = cameraMegapixel;
    }

    @Override
    public void call() {
        System.out.println(getBrandName() + " " + "call to another phone..");
    }

    @Override
    public void ring() {
        System.out.println(getBrandName() + " " + "is ringing..");
    }
}
