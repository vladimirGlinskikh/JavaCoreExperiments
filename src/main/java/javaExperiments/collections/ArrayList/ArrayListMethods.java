package javaExperiments.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        System.out.println("--------------------");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add(1, "four");
        System.out.println("add: " + arrayList);


        System.out.println("---------------------");
        System.out.println("get: " + arrayList.get(3));

        System.out.println("---------------------");
        arrayList.set(1, "five");
        System.out.print("set: ");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }

        System.out.println("\n" + "---------------------");
        arrayList.remove(2);
        System.out.print("remove: ");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println("\n" + "---------------------");

        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        list.add("list4");
        list.add("list3");
        list.addAll(2, arrayList);
        System.out.print("addAll: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n" + "---------------------");

        System.out.println("indexOf: " + list.indexOf("list3"));
        System.out.println("--------------------------");

        System.out.println("lastIndexOf: " + list.lastIndexOf("list3"));
        System.out.println("--------------------------");

        System.out.println("size: " + list.size());
        System.out.println("--------------------------");

        System.out.println("contains: " + list.contains("one"));
        System.out.println("--------------------------");

        System.out.println("toString: " + list.toString());
        System.out.println("--------------------------");

        list.clear();
        System.out.println("clear: " + list);
        System.out.println("------------------------");

        System.out.println("isEmpty: " + list.isEmpty());
        System.out.println("--------------------------");
    }
}
