package core.objectOrientedConcepts.dataAbstraction.anInterfaceAndAClassThatImplementsTheInterface;

public class FullTimeEmployee implements Employee {
    protected String name;
    protected double grossPay;

    public FullTimeEmployee() {
        final String EMPTY_STRING = "";
        name = EMPTY_STRING;
        grossPay = 0.00;
    }

    public FullTimeEmployee(String name, double grossPay) {
        this.name = name;
        this.grossPay = grossPay;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getGrossPay() {
        return grossPay;
    }

    public String toString() {
        return name + MONEY.format(grossPay) + "HOURLY";
    }
}
