package functionalInterfaces.traversingObjects.spliterators;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArraySpliterator implements Spliterator<Integer> {
    Integer[] array;
    int cursor;

    public ArraySpliterator(Integer... a) {
        array = Arrays.copyOf(a, a.length);
        cursor = 0;
    }

    public static void main(String[] args) {
        ArraySpliterator arraySpliterator = new ArraySpliterator(1, 2, 3, 4, 5);
        Spliterator<Integer> firstHalf = arraySpliterator.trySplit();
        firstHalf.forEachRemaining(x -> System.out.println("First half: " + x));
        arraySpliterator.forEachRemaining(x -> System.out.println("Second half: " + x));
    }

    @Override
    public boolean tryAdvance(Consumer<? super Integer> action) {
        boolean result = true;
        action.accept(array[cursor]);
        cursor++;
        if (cursor >= array.length)
            result = false;
        return result;
    }

    @Override
    public Spliterator<Integer> trySplit() {
        int midpoint = array.length / 2;
        Integer[] temp = new Integer[midpoint];
        Integer[] temp2;
        if (array.length % 2 > 0)
            temp2 = new Integer[midpoint + 1];
        else temp2 = new Integer[midpoint];
        for (int i = 0; i < midpoint; i++)
            temp[i] = array[i];
        for (int i = midpoint; i < array.length; i++)
            temp2[i - midpoint] = array[i];
        array = temp2;
        return new ArraySpliterator(temp);
    }

    @Override
    public long estimateSize() {
        return array.length;
    }

    @Override
    public int characteristics() {
        return SIZED | SUBSIZED | ORDERED | NONNULL;
    }
}
