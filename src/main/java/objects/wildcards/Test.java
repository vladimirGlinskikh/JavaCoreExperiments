package objects.wildcards;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    static void printCollection(Collection<?> collection) {
        for (Object object : collection) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("Java");
        printCollection(collection);
    }
}
