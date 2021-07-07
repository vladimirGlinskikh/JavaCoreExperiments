package functionalInterfaces.collections.functionalInterfacesAndSet;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<String> name = new TreeSet<>();
        name.add("Vladimir");
        name.add("Andrey");
        name.add("Angelina");

        name.removeIf(x -> x.charAt(0) == 'V');
        name.forEach(System.out::println);
    }
}
