package algorithms.insertSort;

public class App {
    public static void main(String[] args) {
        int maxSize = 100;
        InsertArray insertArray = new InsertArray(maxSize);
        insertArray.insert(34);
        insertArray.insert(62);
        insertArray.insert(78);
        insertArray.insert(1);
        insertArray.insert(7);
        insertArray.insert(2);
        insertArray.insert(8);
        insertArray.insert(23);
        insertArray.insert(32);
        insertArray.insert(90);

        insertArray.display();
        insertArray.insertionSort();
        System.out.println("--------------------------------");
        insertArray.display();
    }
}
