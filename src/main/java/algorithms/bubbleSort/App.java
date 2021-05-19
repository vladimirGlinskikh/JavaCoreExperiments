package algorithms.bubbleSort;

public class App {
    public static void main(String[] args) {
        int maxSize = 100;
        BubbleArray array = new BubbleArray(maxSize);
        array.insert(34);
        array.insert(12);
        array.insert(564);
        array.insert(37);
        array.insert(74);
        array.insert(37);
        array.insert(2);
        array.insert(74);
        array.insert(53);
        array.insert(84);

        array.display();
        System.out.println("-----------------------------");
        array.bubbleSort();
        array.display();
    }
}
