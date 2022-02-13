package core.collection.arrayList;

import java.util.ArrayList;

public class ArrayListMethodsPartTwo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("3");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        System.out.println(arrayList);
        System.out.println("---------------------");

//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("4");
//        arrayList1.add("5");
//        arrayList1.add("6");
//        arrayList.addAll(1, arrayList1);
//        System.out.println(arrayList);
//        arrayList.clear();
        System.out.println("---------------------");

        System.out.println(arrayList.indexOf("3"));
        System.out.println(arrayList.lastIndexOf("3"));
    }
}
