package functionalInterfaces.functions.numberParser;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class NumberParser {
    private static <R extends Number> R parse(String x, Function<String, R> function) {
        return function.apply(x);
    }

    public static void main(String[] args) {
        List<Function<String, ? extends Number>> list = new ArrayList<>();

        list.add(Byte::parseByte);
        list.add(Short::parseShort);
        list.add(Integer::parseInt);
        list.add(Long::parseLong);
        list.add(Float::parseFloat);
        list.add(Double::parseDouble);

        String[] numbers = {"10", "20", "30", "40", "50", "60"};
        Number[] results = new Number[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            results[i] = parse(numbers[i], list.get(i));
            System.out.println(results[i]);
        }
    }
}
