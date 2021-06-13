package functionalInterfaces.predicates;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 6;
        if (predicate.test(9)) {
            System.out.println("Predicate x > 6 is true for x == 9");
        } else {
            System.out.println("Predicate x > 6 is false for x == 9");
        }

        if (predicate.test(4)) {
            System.out.println("Predicate x > 6 is true for x == 4");
        } else {
            System.out.println("Predicate x > 6 is false for x == 4");
        }
    }
}
