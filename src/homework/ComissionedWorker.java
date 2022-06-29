package homework;

public class ComissionedWorker extends Employee {

    public ComissionedWorker(String name) {
        super(name);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Comissioned salary");
    }

    @Override
    public void calculateBonus() {
        System.out.println("Comissioned Bonus");
    }

    @Override
    public void calculateFullPayment() {
        System.out.println("Salary + Bonus");
    }
}
