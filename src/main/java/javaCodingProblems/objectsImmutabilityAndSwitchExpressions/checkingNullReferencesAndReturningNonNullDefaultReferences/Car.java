package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingNullReferencesAndReturningNonNullDefaultReferences;

import java.awt.*;
import java.util.Objects;

public class Car {
    private final String name;
    private final Color color;

    public Car(String name, Color color) {
//        if (name == null) {
//            this.name = "No name";
//        } else {
//            this.name = name;
//        }
//
//        if (color == null) {
//            this.color = new Color(0, 0, 0);
//        } else {
//            this.color = color;
//        }

        this.name = Objects.requireNonNullElse(name, "No name");
        this.color = Objects.requireNonNullElseGet(color, () -> new Color(0, 0, 0));
    }
}
