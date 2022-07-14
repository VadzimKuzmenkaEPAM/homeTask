package homework;

public class main {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Dima", 3, new Byn(2000));
        SalariedEmployee salariedEmployee = new SalariedEmployee("Dima", new Byn(2000), 0.3);
        ComissionedEmployee comissionedEmployee = new ComissionedEmployee("Dima", 0.20, new Byn(2400), 0.30);

        FullPayment calculateFullPayment = new FullPayment();
        System.out.println(calculateFullPayment.calculateFullPayment(hourlyEmployee));
        System.out.println(calculateFullPayment.calculateFullPayment(salariedEmployee));
        System.out.println(calculateFullPayment.calculateFullPayment(comissionedEmployee));
    }
}