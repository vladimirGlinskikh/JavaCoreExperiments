package functionalInterfaces.traversingObjects.traversingIterable;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.function.IntConsumer;

public class IntsExample implements Iterable<Integer> {
    private final int[] array;

    public IntsExample(int... a) {
        array = Arrays.copyOf(a, a.length);
    }

    public PrimitiveIterator<Integer, IntConsumer> iterator() {
        return new IntIter();
    }

    private class IntIter implements PrimitiveIterator<Integer, IntConsumer> {
        private int cursor;

        public IntIter() {
            cursor = 0;
        }

        @Override
        public void forEachRemaining(IntConsumer c) {
            while (hasNext()) {
                c.accept(array[cursor]);
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
}
