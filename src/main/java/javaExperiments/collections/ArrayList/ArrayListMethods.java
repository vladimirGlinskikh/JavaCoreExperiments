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
        arrayList.add(1,"four");
        System.out.println("add: " + arrayList);


        System.out.println("---------------------");
        System.out.println("get: " + arrayList.get(3));

        System.out.println("---------------------");
        arrayList.set(1, "five");
        System.out.print("set: ");
        for (String s : arrayList){
            System.out.print(s + " ");
        }

        System.out.println("\n" +"---------------------");
        arrayList.remove(2);
        System.out.print("remove: ");
        for (String s : arrayList){
            System.out.print(s + " ");
        }
        System.out.println("\n" + "---------------------");
    }
}
