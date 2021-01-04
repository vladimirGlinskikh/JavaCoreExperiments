package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingNullReferencesAndThrowingCustomizedNullPointerException;

import java.awt.*;
import java.util.Objects;

public class Car {
    private final String name;
    private final Color color;

    public Car(String name, Color color) {
//        if (name == null) {
//            throw new NullPointerException("Car name cannot be null");
//        } else {
//            System.out.println(name);
//        }

//        if (color == null) {
//            throw new NullPointerException("Car color cannot be null");
//        } else {
//            System.out.println(color);
//        }

//        this.name = name;
//        this.color = color;

        this.name = Objects.requireNonNull(name, "Car name cannot be null");
        this.color = Objects.requireNonNull(color, "Car color cannot be null");
    }

    public void assignDriver(String licence, Point location) {
//        if (licence == null) {
//            throw new NullPointerException("Licence cannot be null");
//        } else {
//            System.out.println(licence);
//        }
//
//        if (location == null) {
//            throw new NullPointerException("Location cannot be null");
//        } else {
//            System.out.println(location);
//        }

        Objects.requireNonNull(licence, "Licence cannot be null");
        Objects.requireNonNull(location, "Location cannot be null");
    }
}
