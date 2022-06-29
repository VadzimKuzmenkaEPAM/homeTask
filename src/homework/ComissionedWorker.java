package homework;

public class ComissionedWorker extends Employee {

    public ComissionedWorker(String name) {
        super(name);
    }

    @Override
    public void payment() {
        System.out.println("Comissioned salary");
    }

    @Override
    public void bonus() {
        System.out.println("Comissioned Bonus");
    }

    @Override
    public void fullPayment() {
        System.out.println("Salary + Bonus");
    }
}
