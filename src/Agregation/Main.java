package Agregation;

public class Main {
    public static void main(String[] args) {
        Car employeeCar = new Car("BMW", "Black");
        Employee employeeAlex = new Employee("Alex", "Ivanov", 29, employeeCar);
        System.out.println("Alex have car -> " +
                employeeAlex.car.getBrandName() + " " +
                employeeAlex.car.getColour() + " colour");

    }
}
