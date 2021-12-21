package core.collection;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class App {
    public static void main(String[] args) {
//        System.out.println(nCopies(4, 5));
        System.out.println(rangeSet(10, 20).contains(10));
        System.out.println(rangeSet(10, 20).contains(20));
        System.out.println(rangeSet(10, 20));
        System.out.println(rangeSet(0, Integer.MAX_VALUE).contains(-1));
    }

    static <T> Iterable<T> nCopies(T value, int count) {
        if (count < 0)
            throw new IllegalArgumentException("Negative count: " + count);
        return () -> new Iterator<>() {
            int rest = count;

            @Override
            public boolean hasNext() {
                return rest > 0;
            }

            @Override
            public T next() {
                if (rest == 0)
                    throw new NoSuchElementException();
                rest--;
                return value;
            }
        };
    }

    static Set<Integer> rangeSet(int fromInclusive, int toExclusive) {
        return new AbstractSet<>() {
            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<>() {
                    int next = fromInclusive;

                    @Override
                    public boolean hasNext() {
                        return next != toExclusive;
                    }

                    @Override
                    public Integer next() {
                        if (next == toExclusive) {
                            throw new NoSuchElementException();
                        }
                        return next++;
                    }
                };
            }

            @Override
            public int size() {
                return toExclusive - fromInclusive;
            }
        };
    }
}
