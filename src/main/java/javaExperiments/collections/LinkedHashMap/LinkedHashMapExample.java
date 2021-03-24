package javaExperiments.collections.LinkedHashMap;

import javaExperiments.collections.equalsAndHushCode.Student;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
//        Map<Student, Double> linkedHashMap = new LinkedHashMap<>();
        Map<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Vladimir", "Glinskikh", 4);
        Student st2 = new Student("Svetlana", "Polnikova", 2);
        Student st3 = new Student("Alexandr", "Kotov", 4);
        Student st4 = new Student("Valentin", "Petrov", 2);
        Student st5 = new Student("Genady", "Sidorov", 1);
        Student st6 = new Student("Oly", "Titova", 5);
        Student st7 = new Student("Elena", "Milonova", 6);
        linkedHashMap.put(3.2, st1);
        linkedHashMap.put(9.3, st2);
        linkedHashMap.put(7.1, st3);
        linkedHashMap.put(9.1, st4);
        linkedHashMap.put(5.1, st5);
        linkedHashMap.put(1.1, st6);
        linkedHashMap.put(0.1, st7);

//        linkedHashMap.put(st1, 3.2);
//        linkedHashMap.put(st2, 9.3);
//        linkedHashMap.put(st3, 7.1);
//        linkedHashMap.put(st4, 9.1);
//        linkedHashMap.put(st5, 5.1);
//        linkedHashMap.put(st6, 1.1);
//        linkedHashMap.put(st7, 0.1);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(1.1));
        System.out.println(linkedHashMap.get(9.1));
        System.out.println(linkedHashMap);
    }
}
