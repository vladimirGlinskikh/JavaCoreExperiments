package core.objectOrientedConcepts.inheritance;

import core.objectOrientedConcepts.dataAbstraction.anInterfaceAndAClassThatImplementsTheInterface.Employee;
import core.objectOrientedConcepts.dataAbstraction.anInterfaceAndAClassThatImplementsTheInterface.FullTimeEmployee;

public class HourlyEmployee extends FullTimeEmployee implements Employee {
    protected int hoursWorked;
    protected double payRate, regularPay, overtimePay;

    public final static int MAX_REGULAR_HOURS = 40;
    public final static double OVERTIME_FACTOR = 1.5;

    public HourlyEmployee() {
        hoursWorked = 0;
        payRate = 0.00;
        regularPay = 0.00;
        overtimePay = 0.00;
    }

    public HourlyEmployee(String name, int hoursWorked, double payRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

        if (hoursWorked <= MAX_REGULAR_HOURS) {
            regularPay = hoursWorked * payRate;
            overtimePay = 0.00;
        } else {
            regularPay = MAX_REGULAR_HOURS * payRate;
            overtimePay = (hoursWorked - MAX_REGULAR_HOURS) * (payRate * OVERTIME_FACTOR);
        }
        grossPay = regularPay + overtimePay;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getRegularPay() {
        return regularPay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public String toString() {
        final String FULL_TIME_STATUS = "FULL TIME";
        return super.toString() + FULL_TIME_STATUS;
    }
}
