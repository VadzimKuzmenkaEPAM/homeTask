package homework;

public class HourlyEmployee extends Employee {
    private int hoursWork;
    private Byn salaryPerHour;

    public HourlyEmployee(String name, int hoursWork, Byn salaryPerHour) {
        super(name);
        this.hoursWork = hoursWork;
        this.salaryPerHour = salaryPerHour;
    }

   @Override
    public Byn calculateSalary() {
        return new Byn(salaryPerHour.getValue() * hoursWork);
    }

    @Override
    public Byn calculateBonus() {
        System.out.println("Hourly employee don't have a bonus");
        return new Byn (0);
    }
}