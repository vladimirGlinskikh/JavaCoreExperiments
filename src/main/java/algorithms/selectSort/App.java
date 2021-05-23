package algorithms.selectSort;

public class App {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySelect arraySelect = new ArraySelect(maxSize);

        arraySelect.insert(34);
        arraySelect.insert(6);
        arraySelect.insert(22);
        arraySelect.insert(7);
        arraySelect.insert(96);
        arraySelect.insert(345);
        arraySelect.insert(99);
        arraySelect.insert(222);
        arraySelect.insert(89);
        arraySelect.insert(23);

        arraySelect.display();
        System.out.println("----------------------------");
        arraySelect.selectionSort();
        arraySelect.display();
    }
}
