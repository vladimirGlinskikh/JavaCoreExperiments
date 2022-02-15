package core.collection.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(-1);
        list.add(0);
        list.add(34);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(56);
        list.add(35);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list, 56);
        System.out.println(index);
    }
}
