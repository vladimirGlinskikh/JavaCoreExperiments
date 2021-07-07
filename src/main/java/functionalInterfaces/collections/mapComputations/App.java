package functionalInterfaces.collections.mapComputations;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class App {
    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> bin = (k, v) -> v == null ? null : v / 4;
        Map<String, Integer> map = new TreeMap<>();
        map.put("RED", 34);
        map.put("GREEN", null);
        map.put("BLUE", 23);
        map.put("ORANGE", null);
        System.out.println(map.compute("RED", bin));
        System.out.println(map.compute("ORANGE", bin));
        System.out.println(map.compute("BLUE", bin));

        System.out.println();
        map.forEach((x, y) -> System.out.println(x + " " + y));
    }
}
