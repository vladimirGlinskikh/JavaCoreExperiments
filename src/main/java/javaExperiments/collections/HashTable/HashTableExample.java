package javaExperiments.collections.HashTable;

import javaExperiments.collections.equalsAndHushCode.Student;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Map<Double, Student> ht = new Hashtable<>();

        Student st1 = new Student("Vladimir", "Glinskikh", 4);
        Student st2 = new Student("Svetlana", "Polnikova", 2);
        Student st3 = new Student("Alexandr", "Kotov", 4);
        Student st4 = new Student("Valentin", "Petrov", 2);
        Student st5 = new Student("Genady", "Sidorov", 1);
        Student st6 = new Student("Oly", "Titova", 5);
        Student st7 = new Student("Elena", "Milonova", 6);
        ht.put(3.2, st1);
        ht.put(9.3, st2);
        ht.put(7.1, st3);
        ht.put(9.1, st4);
        ht.put(5.1, st5);
        ht.put(1.1, st6);
//        ht.put(null, null);

//        ht.put(st1, 3.2);
//        ht.put(st2, 9.3);
//        ht.put(st3, 7.1);
//        ht.put(st4, 9.1);
//        ht.put(st5, 5.1);
//        ht.put(st6, 1.1);
//        ht.put(st7, 0.1);
        System.out.println(ht);
    }
}
