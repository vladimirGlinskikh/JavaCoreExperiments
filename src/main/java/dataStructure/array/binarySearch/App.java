package dataStructure.array.binarySearch;

public class App {
    private final long[] array;
    private int nElems;

    public App(int max) {
        array = new long[max];
        nElems = 0;
    }

    public static void main(String[] args) {
        int maxSize = 100;
        App app = new App(maxSize);
        app.insert(23);
        app.insert(34);
        app.insert(53);
        app.insert(22);
        app.insert(13);
        app.insert(60);
        app.insert(20);
        app.insert(17);
        app.insert(64);
        app.insert(21);
        app.display();

        int searchKey = 53;
        if (app.find(searchKey) != app.size())
            System.out.println("Found " + searchKey);
        else System.out.println("Can't find " + searchKey);

        app.delete(64);
        app.delete(17);
        app.display();
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int cursor;

        while (true) {
            cursor = (lowerBound + upperBound) / 2;
            if (array[cursor] == searchKey)
                return cursor;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (array[cursor] < searchKey)
                    lowerBound = cursor + 1;
                else upperBound = cursor - 1;
            }
        }
    }

    public void insert(long value) {
        int i;
        for (i = 0; i < nElems; i++)
            if (array[i] > value)
                break;
        if (nElems - i >= 0)
            System.arraycopy(array, i, array, i + 1, nElems - i);
        array[i] = value;
        nElems++;
    }

    public void delete(long value) {
        int j = find(value);
        if (j != nElems) {
            if (nElems - j >= 0)
                System.arraycopy(array, j + 1, array, j, nElems - j);
            nElems--;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
