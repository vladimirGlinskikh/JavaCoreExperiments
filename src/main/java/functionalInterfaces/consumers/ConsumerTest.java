package functionalInterfaces.consumers;

import java.util.function.Consumer;

public class ConsumerTest {
    private static int sum = 0;

    public static void main(String[] args) {
        Consumer<Integer> consumer = x -> sum += x;
        consumer.accept(5);
        consumer.accept(6);
        System.out.println(sum);
    }
}
