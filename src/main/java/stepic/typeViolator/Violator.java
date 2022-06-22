package stepic.typeViolator;

import java.util.ArrayList;
import java.util.List;

public class Violator {
    public static List<Box<? extends Bakery>> defraud() {
        List<Box<? extends Bakery>> listBox = new ArrayList();

        Paper paper = new Paper();
        Box box = new Box();
        box.put(paper);
        listBox.add(box);

        return listBox;
    }
}
