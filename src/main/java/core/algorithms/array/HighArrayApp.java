package core.algorithms.array;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);

        arr.insert(22);
        arr.insert(56);
        arr.insert(34);
        arr.insert(46);
        arr.insert(27);
        arr.insert(83);
        arr.insert(67);
        arr.insert(29);
        arr.insert(69);
        arr.insert(20);

        arr.display();

        int searchKey = 56;
        if (arr.find(searchKey))
            System.out.println("Found: " + searchKey);
        else
            System.out.println("Can't find: " + searchKey);

        arr.delete(29);
        arr.delete(20);
        arr.delete(34);

        arr.display();
    }
}
