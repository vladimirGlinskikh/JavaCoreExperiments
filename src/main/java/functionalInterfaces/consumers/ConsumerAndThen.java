package functionalInterfaces.consumers;

import java.util.function.Consumer;

public class ConsumerAndThen {
    private static int sum = 0;
    private static int prod = 1;
    private static int fx = 0;

    public static void main(String[] args) {
        Consumer<Integer> consum = x -> sum += x;
        Consumer<Integer> conprod = x -> prod *= x;

        Consumer<Integer> poly = x -> fx += 5 * Math.pow(x, 4);

        consum.andThen(conprod).accept(4);
        consum.andThen(conprod).accept(5);

        System.out.println("sum = " + sum + " prod = " + prod);
        System.out.println("------------------------");

        poly.andThen(x -> fx += 7 * Math.pow(x, 3))
                .andThen(x -> fx += 4 * Math.pow(x, 2))
                .andThen(x -> fx += 3 * x)
                .andThen(x -> fx += 8)
                .andThen(x -> System.out.println(fx))
                .accept(2);
    }
}
