package functionalInterfaces.traversingObjects.traversingSets;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("orange");
        colors.add("yellow");
        colors.add("pink");

        colors.iterator().forEachRemaining(System.out::println);
    }
}
