package functionalInterfaces.traversingObjects.payroll;

import java.util.function.Consumer;

public class Payroll {
    public static void main(String[] args) {
        Consumer<Employee> applyProfit = x -> x.bonus += MomAndPop.profit * x.multiplier;

        MomAndPop company = new MomAndPop();
        MomAndPop.profit = 120_000.0;

        company.forEach(applyProfit.andThen(System.out::println));
    }
}
