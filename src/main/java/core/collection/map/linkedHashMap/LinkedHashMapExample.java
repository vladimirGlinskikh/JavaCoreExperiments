package core.collection.map.linkedHashMap;

import javaExperiments.collections.equalsAndHushCode.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>();
        Student student1 = new Student("Vladimir", "Glinskikh", 3);
        Student student2 = new Student("Vlad", "Vladikov", 1);
        Student student3 = new Student("Egor", "Davidov", 2);

        lhm.put(4.2, student1);
        lhm.put(3.1, student2);
        lhm.put(4.6, student3);

        System.out.println(lhm);
        
    }
}
