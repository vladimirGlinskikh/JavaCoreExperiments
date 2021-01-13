package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingNullReferencesAndReturningNonNullDefaultReferences;

import java.awt.*;

public class Car {
    private final String name;
    private final Color color;

    public Car(String name, Color color) {
        if (name == null) {
            this.name = "No name";
        } else {
            this.name = name;
        }

        if (color == null) {
            this.color = new Color(0, 0, 0);
        } else {
            this.color = color;
        }
    }
}
