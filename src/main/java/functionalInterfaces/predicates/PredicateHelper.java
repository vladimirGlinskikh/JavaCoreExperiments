package functionalInterfaces.predicates;

import java.util.function.Predicate;

public class PredicateHelper {
    public static <X> void result(Predicate<X> predicate, X arg) {
        if (predicate.test(arg)) {
            System.out.println("The Predicate is true for " + arg);
        } else {
            System.out.println("The Predicate is false for " + arg);
        }
    }

    public static void main(String[] args) {
        result(x -> x > 2, 6);
        result(s -> s.charAt(0) == 'H', "Hello");
        result(y -> y >= 4.0, 3.9);
    }
}
