package javaExperiments.collections.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        System.out.println(vector);
        System.out.println("firstElement(): " + vector.firstElement());
        System.out.println("lastElement(): " + vector.lastElement());
        vector.remove(1);
        System.out.println(vector);
        System.out.println("get():" + vector.get(1));
    }
}
