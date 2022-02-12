package core.collection.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        System.out.println(arrayList);
        System.out.println("----------------------");

        ArrayList<String> arrayList1 = new ArrayList<>(200);
        arrayList1.add("one");
        arrayList1.add("two");
        arrayList1.add("three");
        System.out.println(arrayList1);
        System.out.println("----------------------");

        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        System.out.println("----------------------");
    }
}
