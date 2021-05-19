package algorithms.bubbleSort;

public class BubbleArray {
    private final long[] array;
    private int nElement;

    public BubbleArray(int max) {
        array = new long[max];
        nElement = 0;
    }

    public void insert(long value) {
        array[nElement] = value;
        nElement++;
    }

    public void display() {
        for (int i = 0; i < nElement; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        int outer, inner;
        for (outer = nElement - 1; outer > 1; outer--)
            for (inner = 0; inner < outer; inner++)
                if (array[inner] > array[inner + 1])
                    swap(inner, inner + 1);
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
