package oop.inheritance;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {
    private final LocalDate hireDay;
    private double salary;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(hireDay, employee.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hireDay, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDay=" + hireDay +
                ", salary=" + salary +
                '}';
    }
}
