package functionalInterfaces.traversingObjects;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.function.IntConsumer;

public class PrimitiveIteratorGenerator implements PrimitiveIterator<Integer, IntConsumer> {
    private final int[] array;
    private int cursor;

    public PrimitiveIteratorGenerator(int... a) {
        cursor = 0;
        array = Arrays.copyOf(a, a.length);
    }

    public static void main(String[] args) {
        PrimitiveIteratorGenerator iteratorGenerator = new PrimitiveIteratorGenerator(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        iteratorGenerator.forEachRemaining((IntConsumer) System.out::println);
    }

    @Override
    public void forEachRemaining(IntConsumer consumer) {
        while (hasNext()) {
            consumer.accept(array[cursor]);
            cursor++;
        }
    }

    @Override
    public boolean hasNext() {
        return cursor < array.length;
    }

    @Override
    public Integer next() {
        int i = 0;
        if (hasNext()) {
            i = array[cursor];
            cursor++;
        }
        return i;
    }
}
