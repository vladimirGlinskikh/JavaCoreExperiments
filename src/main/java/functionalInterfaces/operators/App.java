package functionalInterfaces.operators;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        UnaryOperator<String> concat = x -> x + x;
        UnaryOperator<Integer> increment = x -> ++x;
        UnaryOperator<Long> decrement = x -> --x;

        IntUnaryOperator iuo = x -> x + 5;
        LongUnaryOperator luo = x -> x / 3L;
        DoubleUnaryOperator duo = x -> x * 2.1;

        BinaryOperator<String> concat1 = (x, y) -> x + y;
        BinaryOperator<Integer> subtract = (x, y) -> x - y;
        BinaryOperator<Long> multiply = (x, y) -> x * y;

        IntBinaryOperator ibo = (x, y) -> x + y + 5;
        LongBinaryOperator lbo = (x, y) -> (x + y) / 3L;
        DoubleBinaryOperator dbo = (x, y) -> x * y * 0.5;

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

        System.out.println(iuo.andThen(x -> x * 2).applyAsInt(4));
        System.out.println(luo.compose(x -> x * 6).applyAsLong(4));
        System.out.println(duo.andThen(DoubleUnaryOperator.identity()).applyAsDouble(4.1));
        System.out.println("------------------------ ");

        System.out.println(concat1.apply("Binary", "Operator"));
        System.out.println(subtract.apply(4, 1));
        System.out.println(multiply.apply(4L, 3l));
        System.out.println("--------------------------");

        System.out.println(ibo.applyAsInt(4, 2));
        System.out.println(lbo.applyAsLong(9L, 3L));
        System.out.println(dbo.applyAsDouble(4.0, 6.0));
    }
}
