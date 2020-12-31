package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingNullReferencesInFunctionalStyleAndImperativeCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class App {
    public List<Integer> eventIntegers(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer nr : integers) {
            if (Objects.nonNull(nr) && nr % 2 == 0) {
                evens.add(nr);
            }
        }
        return evens;
    }
}
