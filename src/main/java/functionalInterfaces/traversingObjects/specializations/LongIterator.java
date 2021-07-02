package functionalInterfaces.traversingObjects.specializations;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class LongIterator implements PrimitiveIterator.OfLong {
    private final long[] array;
    private int cursor;

    public LongIterator(long... a) {
        cursor = 0;
        array = Arrays.copyOf(a, a.length);
    }

    @Override
    public long nextLong() {
        long l = 0;
        if (hasNext()) {
            l = array[cursor];
            cursor++;
        }
        return l;
    }

    @Override
    public boolean hasNext() {
        return cursor < array.length;
    }
}
