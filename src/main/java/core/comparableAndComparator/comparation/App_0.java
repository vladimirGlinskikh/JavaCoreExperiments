package core.comparableAndComparator.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App_0 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vladimir");
        list.add("Andrey");
        list.add("Oleg");
        System.out.println("Before sorting");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting");
        System.out.println(list);
    }
}
