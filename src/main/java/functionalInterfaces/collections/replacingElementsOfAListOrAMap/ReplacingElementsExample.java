package functionalInterfaces.collections.replacingElementsOfAListOrAMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class ReplacingElementsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(16, 12, 8, 4, 6);
        UnaryOperator<Integer> divide = x -> x / 2;
        list.replaceAll(divide);
        list.forEach(System.out::println);
        System.out.println("---------------");

        Map<String, String> map = new TreeMap<>();
        map.put("Vladimir", "Glinskikh");
        map.put("Andrey", "Shatalov");
        BiFunction<String, String, String> biFunction = (k, v) -> "Mr. " + v;
        map.replaceAll(biFunction);
        map.forEach((x, y) -> System.out.println(y + " " + x));
    }
}
