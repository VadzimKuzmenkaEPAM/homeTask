package homework;

public class SalariedEmployee extends Employee {
    private Byn salary;
    private double bonusCoefficient;

    public SalariedEmployee(String name, Byn salary, double bonusCoefficient) {
        super(name);
        this.salary = salary;
        this.bonusCoefficient = bonusCoefficient;
    }

    @Override
    public Byn calculateSalary() {
        return salary;
    }

    @Override
    public Byn calculateBonus() {
        return new Byn(salary.mulRub(bonusCoefficient));
    }
}