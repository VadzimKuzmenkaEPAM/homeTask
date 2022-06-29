package homework;

public class SalariedWorker extends Employee {
    public SalariedWorker(String name) {
        super(name);
    }

    @Override
    public void payment() {
        System.out.println("salary");
    }

    @Override
    public void bonus() {
        System.out.println("bonus");
    }

    @Override
    public void fullPayment() {
        System.out.println("salary + bonus");
    }
}

