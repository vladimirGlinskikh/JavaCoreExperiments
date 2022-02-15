package core.collection.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        System.out.println(vector);
        System.out.println("-------------");
        System.out.println(vector.firstElement());
        System.out.println("-------------");
        System.out.println(vector.lastElement());
        System.out.println("-------------");
        vector.remove(2);
        System.out.println(vector);
        System.out.println("-------------");
        System.out.println(vector.get(1));
        System.out.println("-------------");
    }
}
