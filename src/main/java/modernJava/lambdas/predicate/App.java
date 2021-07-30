package modernJava.lambdas.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                results.add(t);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList(
                "One", "", "Two", "Three", "", "Four", "Five"
        );
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
        System.out.println(nonEmpty);
    }
}
