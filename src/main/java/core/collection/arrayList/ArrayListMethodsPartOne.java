package core.collection.arrayList;

import java.util.ArrayList;

public class ArrayListMethodsPartOne {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add(1, "four");

        for (String s : arrayList) {
            System.out.println(s + " ");
        }
        System.out.println("----------------------");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("----------------------");

        arrayList.set(2, "five");
        System.out.println(arrayList);
        System.out.println("----------------------");

        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println("----------------------");


    }
}
