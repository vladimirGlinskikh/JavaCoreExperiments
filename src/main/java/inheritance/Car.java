package inheritance;

import java.security.Key;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    public boolean lock(Key key) {
        return false;
    }
}
