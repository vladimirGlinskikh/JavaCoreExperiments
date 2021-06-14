package functionalInterfaces.predicates;

import java.util.function.Predicate;

public class PredicateMethods {
    public static void result(Predicate<Integer> predicate, Integer arg) {
        if (predicate.test(arg)) {
            System.out.println("The Predicate is true for " + arg);
        } else {
            System.out.println("The Predicate is false for " + arg);
        }
    }

    public static void main(String[] args) {
        result(x -> x == 5, 5);
        result(y -> y % 2 == 0, 5);
    }
}
