package inheritence.phone;

public class Phone implements Callable, Ringable {
    private String brandName;
    private static int yearOfIssue;

   static  {
        yearOfIssue = 150;
        System.out.println("static block from Phone class is working");
    }

    {
        brandName = "Nokia";
        System.out.println("non-static block from Smartphone class is working");

    }

    public Phone(String brandName, int yearOfIssue) {
        this.brandName = brandName;
        this.yearOfIssue = yearOfIssue;
        System.out.println("Constructor from phone class working..");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public void call() {
        System.out.println("We call another phone..");
    }

    @Override
    public void ring() {
        System.out.println("The phone is ringing..");
    }
}