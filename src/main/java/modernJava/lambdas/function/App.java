package modernJava.lambdas.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class App {
    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
//        List<Integer> list = map(Arrays.asList("Lambdas", "in", "action"),
//                String::length);
//        System.out.println(list);

        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));

        Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 0;
        System.out.println(oddNumbers.test(1000));
    }
}
