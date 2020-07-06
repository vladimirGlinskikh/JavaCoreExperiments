package core.inner.localInner;

import java.util.Iterator;

public class TitleListTest {
    public static void main(String[] args) {
        TitleList titleList = new TitleList();

        titleList.addTitle("Java 11 Revealed");
        titleList.addTitle("Beginning Java 9");
        titleList.addTitle("Learn JavaFX 9");

        Iterator<String> iterator = titleList.titleIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
