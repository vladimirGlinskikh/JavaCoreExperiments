package modernJava.filteringGreenApples;

import static modernJava.filteringGreenApples.Color.RED;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return RED.equals(apple.getColor())
                && apple.getWeight() > 110;
    }
}
