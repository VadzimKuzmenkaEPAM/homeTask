package inheritence.phone;

public class Phone implements Call, Ring {
    private String brandName;
    private int yearOfIssue;

    public Phone(String brandName, int yearOfIssue) {
        this.brandName = brandName;
        this.yearOfIssue = yearOfIssue;
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
