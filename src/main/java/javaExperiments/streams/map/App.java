package javaExperiments.streams.map;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        final List<Integer> integerStream = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(integerStream);

        int[] array = {6, 7, 9, 2, 4};
        array = Arrays.stream(array)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                }).toArray();
//        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Six");
        set.add("Seven");
        System.out.println(set);

        final Set<Integer> collect = set.stream()
                .map(String::length)
                .collect(Collectors.toSet());

        final List<Integer> collect1 = set.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }
}
