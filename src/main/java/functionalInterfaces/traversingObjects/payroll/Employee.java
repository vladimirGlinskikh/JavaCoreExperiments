package functionalInterfaces.traversingObjects.payroll;

public class Employee {
    String name;
    double baseSalary;
    double bonus;
    double multiplier;

    public Employee(String name, double baseSalary, double bonus, double multiplier) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.multiplier = multiplier;
    }

    @Override
    public String toString() {
        return name + ": base salary = " + baseSalary
                + " bonus = " + bonus;
    }
}
