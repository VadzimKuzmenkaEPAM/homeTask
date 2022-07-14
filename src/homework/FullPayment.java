package homework;

public class FullPayment {

    public Byn calculateFullPayment(Employee employee) {
        return employee.calculateSalary().addRub(employee.calculateBonus());
    }
}