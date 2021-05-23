package algorithms.selectSort;

public class ArraySelect {
    private final long[] array;
    private int nElements;

    public ArraySelect(int max) {
        array = new long[max];
        nElements = 0;
    }

    public void insert(long value) {
        array[nElements] = value;
        nElements++;
    }

    public void display() {
        for (int i = 0; i < nElements; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public void selectionSort() {
        int outer, inner, minimum;
        for (outer = 0; outer < nElements - 1; outer++) {
            minimum = outer;
            for (inner = outer + 1; inner < nElements; inner++)
                if (array[inner] < array[minimum])
                    minimum = inner;
            swap(outer, minimum);
        }
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
