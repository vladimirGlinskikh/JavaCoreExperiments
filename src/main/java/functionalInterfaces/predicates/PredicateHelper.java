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
//        result(x -> x > 2, 6);
//        result(s -> s.charAt(0) == 'H', "Hello");
//        result(y -> y >= 4.0, 3.9);
        Predicate<Integer> p1 = x -> x > 10;
//        System.out.println(p1.or(x -> x < 31).test(9));//true

        result(p1.or(x -> x < 3), 9);//false
        result(p1.or(x -> x < 3), 2);//true
        result(p1.or(x -> x < 3), 5);//false
        System.out.println("---------------------");
        result(p1.and(x -> x < 3), 9);//false
        result(p1.and(x -> x < 3), 2);//false
        result(p1.and(x -> x < 3), 5);//false
        System.out.println("---------------------");
        System.out.println(p1.and(x -> x < 3).negate().test(9));//true !((x > 10) && (x < 3)
        System.out.println(p1.and(x -> x < 3).negate().test(2));//true !((x > 10) && (x < 3)
        System.out.println(p1.and(x -> x < 3).negate().test(5));//true !((x > 10) && (x < 3)
        System.out.println("----------------------");
        System.out.println(p1.negate().and(x -> x < 3).test(9));//false (!(x > 10) && (x < 3))
        System.out.println(p1.negate().and(x -> x < 3).test(2));//true (!(x > 10) && (x < 3))
        System.out.println(p1.negate().and(x -> x < 3).test(5));//false (!(x > 10) && (x < 3))
    }
}
