package javaExperiments.lambda.consumer;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> list = List.of("One", "Two", "Three");
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(1);
//        for (String s : list) {
//            System.out.println(s);
//        }
        list.forEach(str -> System.out.println(str));
        list1.forEach(i -> System.out.print(++i + " "));
    }
}
