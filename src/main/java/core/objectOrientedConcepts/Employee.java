package core.objectOrientedConcepts;

import java.text.DecimalFormat;

public interface Employee {
    DecimalFormat MONEY = new DecimalFormat(" $0.00");

    String getName();

    double getGrossPay();

    String toString();
}
