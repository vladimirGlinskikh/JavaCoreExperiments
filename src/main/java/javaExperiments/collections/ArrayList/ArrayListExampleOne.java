package javaExperiments.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleOne {
    public static void main(String[] args) {
        List<String> arryaList1 = new ArrayList<>(20);
        arryaList1.add("one");
        arryaList1.add("two");
        arryaList1.add("three");
        System.out.println(arryaList1);

        List<String> arryaList2 = new ArrayList<>(20);
        arryaList2.add("one");
        arryaList2.add("two");
        arryaList2.add("three");
        System.out.println(arryaList2);

        System.out.println(arryaList1 == arryaList2);
        System.out.println(arryaList1.equals(arryaList2));
    }
}
