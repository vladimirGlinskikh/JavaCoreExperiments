package functionalInterfaces.predicates;

import java.util.function.*;

public class PredicateHelper {

//    public static <X> void result(Predicate<X> predicate, X arg) {
//        if (predicate.test(arg)) {
//            System.out.println("The Predicate is true for " + arg);
//        } else {
//            System.out.println("The Predicate is false for " + arg);
//        }
//    }

    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (x, y) -> x.equals("Test")
                && y > 100_000;
        String position = "Test";
        int salary = 140_000;
        System.out.println(biPredicate.test(position, salary));

//        IntPredicate i = x -> x > 5;
//        LongPredicate l = y -> y % 2 == 0;
//        DoublePredicate d = z -> z > 8.0;
//        System.out.println(i.test(2));
//        System.out.println(l.or(a -> a == 6L).test(10L));
//        System.out.println(d.and(b -> b < 9.0).test(8.5));

//        result(x -> x > 2, 6);
//        result(s -> s.charAt(0) == 'H', "Hello");
//        result(y -> y >= 4.0, 3.9);
//        Predicate<Integer> p1 = x -> x > 7;
//        Predicate<Integer> p2 = Predicate.isEqual(5);
//        Predicate<String> lengthWord = x -> x.length() >= 4;
//        Predicate<String> char0isT = x -> x.charAt(0) == 't';

//        System.out.println(lengthWord.and(char0isT).test("test"));
//
//        Predicate<String> nullProtectedlength = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() >= 4;
//            }
//
//            @Override
//            public Predicate<String> and(Predicate<? super String> other) {
//                return x -> x == null ? false : test(x) && other.test(x);
//            }
//        };
//
//        System.out.println(nullProtectedlength.and(char0isT).test("test"));
//        System.out.println(nullProtectedlength.and(char0isT).test(null));

//        System.out.println(p1.and(Predicate.not(x -> x % 2 == 1)).test(8));

//        if (p2.test(5)) {
//            System.out.println("The Predicate is true");
//            System.out.println(p1.or(Predicate.isEqual(5)).test(5));
//        }
//        System.out.println(p1.or(x -> x < 31).test(9));//true

//        result(p1.or(x -> x < 3), 9);//false
//        result(p1.or(x -> x < 3), 2);//true
//        result(p1.or(x -> x < 3), 5);//false
//        System.out.println("---------------------");
//        result(p1.and(x -> x < 3), 9);//false
//        result(p1.and(x -> x < 3), 2);//false
//        result(p1.and(x -> x < 3), 5);//false
//        System.out.println("---------------------");
//        System.out.println(p1.and(x -> x < 3).negate().test(9));//true !((x > 10) && (x < 3)
//        System.out.println(p1.and(x -> x < 3).negate().test(2));//true !((x > 10) && (x < 3)
//        System.out.println(p1.and(x -> x < 3).negate().test(5));//true !((x > 10) && (x < 3)
//        System.out.println("----------------------");
//        System.out.println(p1.negate().and(x -> x < 3).test(9));//false (!(x > 10) && (x < 3))
//        System.out.println(p1.negate().and(x -> x < 3).test(2));//true (!(x > 10) && (x < 3))
//        System.out.println(p1.negate().and(x -> x < 3).test(5));//false (!(x > 10) && (x < 3))
    }
}
