package core.collection.map.treeMap;

import javaExperiments.collections.equalsAndHushCode.Student;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student student1 = new Student("Vladimir", "Glinskikh", 3);
        Student student2 = new Student("Vlad", "Vladikov", 1);
        Student student3 = new Student("Egor", "Davidov", 2);
        Student student4 = new Student("Elena", "Orlova", 4);
        Student student5 = new Student("Svetlana", "Shugarina", 5);

        treeMap.put(4.2, student1);
        treeMap.put(5.0, student4);
        treeMap.put(3.1, student2);
        treeMap.put(8.2, student5);
        treeMap.put(4.6, student3);
        System.out.println(treeMap);
        System.out.println("--------------------");
        System.out.println(treeMap.get(5.0));
        treeMap.remove(5.0);
        System.out.println("--------------------");
        System.out.println(treeMap);
        System.out.println("--------------------");
        System.out.println(treeMap.descendingMap());
        System.out.println("--------------------");
        System.out.println(treeMap.tailMap(4.6));
        System.out.println("--------------------");
        System.out.println(treeMap.headMap(4.5));
        System.out.println("--------------------");
        System.out.println(treeMap.lastEntry());
    }
}
