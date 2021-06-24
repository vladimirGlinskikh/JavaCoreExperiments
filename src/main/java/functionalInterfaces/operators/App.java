package functionalInterfaces.operators;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        UnaryOperator<String> concat = x -> x + x;
        UnaryOperator<Integer> increment = x -> ++x;
        UnaryOperator<Long> decrement = x -> --x;

        IntUnaryOperator iuo = x -> x + 5;
        LongUnaryOperator luo = x -> x / 3L;
        DoubleUnaryOperator duo = x -> x * 3.2;

        System.out.println(concat.apply("Function Java "));
        System.out.println(increment.apply(4));
        System.out.println(decrement.apply(7L));

        UnaryOperator<String> sident = UnaryOperator.identity();
        System.out.println(sident.apply("Function Java"));
        System.out.println("------------------------");

        System.out.println(iuo.applyAsInt(4));
        System.out.println(luo.applyAsLong(9L));
        System.out.println(duo.applyAsDouble(4.1));
        System.out.println("------------------------");
    }
}
