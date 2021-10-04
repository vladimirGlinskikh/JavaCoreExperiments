package functionalJava.functionalInterface;

import java.util.function.Function;

public class FunctionExample {
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);
        System.out.println(incrementByOneFunction.apply(2));
    }

    static int increment(int number) {
        return number + 1;
    }
}
