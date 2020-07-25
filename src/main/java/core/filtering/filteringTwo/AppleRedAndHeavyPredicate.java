package core.filtering.filteringTwo;

import static core.filtering.filteringTwo.Color.RED;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return RED.equals(apple.getColor())
                && apple.getWeight() >= 150;
    }
}
