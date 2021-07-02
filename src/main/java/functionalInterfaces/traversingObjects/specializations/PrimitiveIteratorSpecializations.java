package functionalInterfaces.traversingObjects.specializations;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveIteratorSpecializations {
    public static void main(String[] args) {
        IntIterator intIterator = new IntIterator(1, 2, 3, 4, 5);
        intIterator.forEachRemaining((IntConsumer) System.out::println);
        System.out.println("---------------------");
        LongIterator longIterator = new LongIterator(6, 7, 8, 9, 10, 11);
        longIterator.forEachRemaining((LongConsumer) System.out::println);
        System.out.println("---------------------");
        DoubleIterator doubleIterator = new DoubleIterator(23.1, 24.1, 45.34, 12.3);
        doubleIterator.forEachRemaining((DoubleConsumer) System.out::println);
    }
}
