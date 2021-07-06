package functionalInterfaces.collections.removingElements;

import java.util.ArrayList;
import java.util.List;

public class RemovingExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Five");

        list.removeIf(x -> x.charAt(0) == 'T');
        list.forEach(System.out::println);
    }
}
