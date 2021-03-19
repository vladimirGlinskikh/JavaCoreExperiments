package javaExperiments.comparationAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparation1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vladimir");
        list.add("Svetlana");
        list.add("Aleksandr");
        System.out.println("Before sorted");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorted");
        System.out.println(list);
    }
}
