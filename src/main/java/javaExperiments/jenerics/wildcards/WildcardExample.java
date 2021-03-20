package javaExperiments.jenerics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
        List<? extends Number> list = new ArrayList<Integer>();
        List<Double> list1 = new ArrayList<>();
        list1.add(2.12);
        list1.add(3.12);
        list1.add(4.12);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        showListInfo(list2);

        List<Double> list3 = new ArrayList<>();
        list3.add(2.12);
        list3.add(3.12);
        list3.add(4.12);
        System.out.println(sum(list3));
    }

    public static void showListInfo(List<?> list) {
        System.out.println("My list contains next elements: " + list);
    }

    public static double sum(List<? extends Number> listDouble) {
        double sum = 0;
        for (Number n : listDouble) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
