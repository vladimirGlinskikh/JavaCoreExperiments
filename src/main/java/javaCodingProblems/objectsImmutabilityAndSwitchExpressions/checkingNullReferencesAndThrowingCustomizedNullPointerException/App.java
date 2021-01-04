package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingNullReferencesAndThrowingCustomizedNullPointerException;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        Car car = new Car("Opel", new Color(123, 12, 34));
        Car car1 = new Car("BMW", new Color(1, 2, 3));

        car.assignDriver("Askona", new Point(1, 1));
        car1.assignDriver("5", new Point(2, 2));
    }
}
