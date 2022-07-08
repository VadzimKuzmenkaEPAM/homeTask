package homework;

public class SalariedWorker extends Employee {
    public SalariedWorker(String name) {
        super(name);
    }

    @Override
    public void calculateSalary() {
        System.out.println("salary");
    }

    @Override
    public void calculateBonus() {
        System.out.println("bonus");
    }

    @Override
    public void calculateFullPayment() {
        System.out.println("salary + bonus");
    }
}

