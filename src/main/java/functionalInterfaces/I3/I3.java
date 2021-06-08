package functionalInterfaces.I3;

import java.util.Random;

public interface I3 {
    private int getNumber() {
        return (new Random()).nextInt(100);
    }

    default String M1(String s) {
        return s + getNumber();
    }
}
