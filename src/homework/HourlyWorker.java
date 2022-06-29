package homework;

public class HourlyWorker extends Employee {
    public HourlyWorker(String name) {
        super(name);
    }

    @Override
    public void payment() {
        System.out.println("Hourly Salary");
    }

    @Override
    public void bonus() {
        System.out.println("Hourly Bonus");
    }

    @Override
    public void fullPayment() {
        System.out.println("Salary + Bonus");
    }
}

