package core.generics.introduction;

import java.util.ArrayList;
import java.util.List;

public class App_0 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("String");
//        list.add(3);
//        list.add(new Object());
//        list.add(new StringBuilder("StringBuilder"));
//        list.add(new Person());
        list.add("One");
        list.add("Two");
        list.add("Three");
        for (Object o : list) {
            System.out.println(o + " length " + ((String) o).length());
        }
    }
}

class Person {
}
