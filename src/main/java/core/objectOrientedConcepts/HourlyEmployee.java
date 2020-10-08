package core.objectOrientedConcepts;

public class HourlyEmployee extends FullTimeEmployee implements Employee {
    private String name;
    private int hoursWorked;
    protected double payRate, regularPay, overtimePay, grossPay;

    public final static int MAX_REGULAR_HOURSE = 40;
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

        if (hoursWorked <= MAX_REGULAR_HOURSE) {
            regularPay = hoursWorked * payRate;
            overtimePay = 0.00;
        } else {
            regularPay = MAX_REGULAR_HOURSE * payRate;
            overtimePay = (hoursWorked - MAX_REGULAR_HOURSE) * (payRate * OVERTIME_FACTOR);
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
        return getOvertimePay();
    }

    public String toString() {
        final String FULL_TIME_STATUS = "HOURLY";
        return super.toString() + FULL_TIME_STATUS;
    }
}
