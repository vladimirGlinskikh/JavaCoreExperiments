package functionalInterfaces.traversingObjects.traversingIterable;

import java.util.function.IntConsumer;

public class App {
    public static void main(String[] args) {
        IntsExample integers = new IntsExample(1, 2, 3, 4, 5, 6, 7);
        integers.forEach(System.out::println);
        System.out.println();
        integers.iterator().forEachRemaining((IntConsumer) System.out::println);
    }
}
