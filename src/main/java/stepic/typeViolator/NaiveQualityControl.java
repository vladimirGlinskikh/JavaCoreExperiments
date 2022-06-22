package stepic.typeViolator;

import java.util.List;

public class NaiveQualityControl {
    public static boolean check(List<Box<? extends Bakery>> boxes) {
        return true;
    }
}
