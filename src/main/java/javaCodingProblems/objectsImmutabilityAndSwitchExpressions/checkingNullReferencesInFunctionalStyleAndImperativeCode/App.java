package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingNullReferencesInFunctionalStyleAndImperativeCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public List<Integer> eventIntegers(List<Integer> integers) {
        if (integers == null) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer nr : integers) {
            if (nr != null && nr % 2 == 0) {
                evens.add(nr);
            }
        }
        return evens;
    }
}
