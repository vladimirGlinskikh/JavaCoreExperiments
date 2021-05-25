package algorithms.insertSort;

public class InsertArray {
    private long[] array;
    private int nElements;

    public InsertArray(int max) {
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

    public void insertionSort() {
        int inner, outer;
        for (outer = 1; outer < nElements; outer++) {
            long temp = array[outer];
            inner = outer;
            while (inner > 0 && array[inner - 1] >= temp) {
                array[inner] = array[inner - 1];
                --inner;
            }
            array[inner] = temp;
        }
    }
}
