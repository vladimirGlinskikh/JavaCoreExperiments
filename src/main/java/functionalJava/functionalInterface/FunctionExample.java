package functionalJava.functionalInterface;

import java.util.function.Function;

public class FunctionExample {
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static int increment(int number) {
        return number + 1;
    }
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyByTenFunction.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen = incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addByOneAndThenMultiplyByTen.apply(3));
//        System.out.println(addByOneAndThenMultiplyByTen);

    }
}
