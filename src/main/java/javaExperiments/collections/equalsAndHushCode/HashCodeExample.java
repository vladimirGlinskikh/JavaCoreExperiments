package javaExperiments.collections.equalsAndHushCode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap();
        Student st1 = new Student("Vladimir", "Glinskikh", 4);
        Student st2 = new Student("Svetlana", "Polnikova", 2);
        Student st3 = new Student("Alexandr", "Kotov", 3);
        map.put(st1, 3.2);
        map.put(st2, 9.3);
        map.put(st3, 6.1);
        System.out.println(map);
        System.out.println("------------------------");

        Student st4 = new Student("Alexandr", "Kotov", 3);
        boolean result = map.containsKey(st4);
        System.out.println(result);
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}