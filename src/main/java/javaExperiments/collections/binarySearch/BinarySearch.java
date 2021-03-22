package javaExperiments.collections.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(-7);
        list.add(-2);
        list.add(9);
        list.add(1);
        Collections.sort(list);
        int index = Collections.binarySearch(list, -2);
        System.out.println(index);
    }
}
