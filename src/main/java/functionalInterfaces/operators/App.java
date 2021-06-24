package functionalInterfaces.operators;

import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        UnaryOperator<String> concat = x -> x + x;
        UnaryOperator<Integer> increment = x -> ++x;
        UnaryOperator<Long> decrement = x -> --x;

        System.out.println(concat.apply("Function Java "));
        System.out.println(increment.apply(4));
        System.out.println(decrement.apply(7L));

        UnaryOperator<String> sident = UnaryOperator.identity();
        System.out.println(sident.apply("Function Java"));
    }
}
