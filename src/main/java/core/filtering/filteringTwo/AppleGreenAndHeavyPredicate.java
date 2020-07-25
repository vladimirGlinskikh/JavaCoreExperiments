package core.filtering.filteringTwo;

import static core.filtering.filteringTwo.Color.GREEN;

public class AppleGreenAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor())
                && apple.getWeight() >= 90;
    }
}
