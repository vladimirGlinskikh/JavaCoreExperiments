package javaExperiments.lambda.predicate;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.removeIf(element -> element.length() < 4);
        System.out.println(list);
    }
}
