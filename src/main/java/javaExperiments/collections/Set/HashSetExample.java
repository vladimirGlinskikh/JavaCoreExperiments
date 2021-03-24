package javaExperiments.collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        System.out.println("set: " + set);

        Set<String> set2 = new HashSet<>();
        set2.add("Five");
        set2.add("Six");
        set2.add("Two");
        set2.add("One");
        set2.add("Seven");
        System.out.println("set2: " + set2);
        System.out.println("-------------------");

        Set<String> union = new HashSet<>(set);
        union.addAll(set2);
        System.out.println("addAll(): " + union);
        System.out.println("---------------------");

        Set<String> intersect = new HashSet<>(set);
        intersect.retainAll(set2);
        System.out.println("retainAll(): " + intersect);
        System.out.println("---------------------");

        Set<String> subtract = new HashSet<>(set);
        subtract.removeAll(set2);
        System.out.println("removeAll(): " + subtract);
        System.out.println("---------------------");
    }
}
