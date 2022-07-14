package homework;

public class ComissionedEmployee extends Employee {
    private double commissionPercentage;
    private Byn productsSold;
    private double bonusCoefficient;

    public ComissionedEmployee(String name, double commissionPercentage, Byn productsSold, double bonusCoefficient) {
        super(name);
        this.commissionPercentage = commissionPercentage;
        this.productsSold = productsSold;
        this.bonusCoefficient = bonusCoefficient;
    }

    @Override
    public Byn calculateSalary() {
        return new Byn(productsSold.multiplyRub(commissionPercentage));
    }

    @Override
    public Byn calculateBonus() {
        return new Byn(calculateSalary().multiplyRub(bonusCoefficient));
    }
}