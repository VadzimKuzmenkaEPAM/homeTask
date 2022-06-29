package homework;

public class main {
    public static void main(String[] args) {
        Employee comissionedWorker = new ComissionedWorker("Ivan");
        Employee houtlyWorker = new HourlyWorker("Alex");
        printInfo(comissionedWorker);
        printInfo(houtlyWorker);
    }


    static void printInfo(Employee employee) {
        System.out.println(employee.name);
        employee.fullPayment();
        employee.payment();
        employee.bonus();
    }
}
