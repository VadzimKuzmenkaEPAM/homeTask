package homework;

public class HourlyWorker extends Employee {
    public HourlyWorker(String name) {
        super(name);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Hourly Salary");
    }

    @Override
    public void calculateBonus() {
        System.out.println("Hourly Bonus");
    }

    @Override
    public void calculateFullPayment() {
        System.out.println("Salary + Bonus");
    }
}

