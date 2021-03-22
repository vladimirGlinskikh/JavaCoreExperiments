package javaExperiments.collections.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("Это оригинальный лист: " + list);

        System.out.println("-----------------------");

        List<String> listCopy = List.copyOf(list);
        for (String s : listCopy) {
            list.remove(s);
        }
        System.out.println("Это оригинальный лист после удаления: " + list);
        System.out.println("Это копия листа: " + listCopy);
    }
}
