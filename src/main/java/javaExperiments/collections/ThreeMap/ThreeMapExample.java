package javaExperiments.collections.ThreeMap;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class ThreeMapExample {
    public static void main(String[] args) {
//        TreeMap<Double, Student> treeMap = new TreeMap<>();
        TreeMap<Student, Double> treeMap = new TreeMap<>((o1, o2) -> o1.name.compareTo(o2.name));

        Student st1 = new Student("Vladimir", "Glinskikh", 4);
        Student st2 = new Student("Svetlana", "Polnikova", 2);
        Student st3 = new Student("Alexandr", "Kotov", 4);
        Student st4 = new Student("Valentin", "Petrov", 2);
        Student st5 = new Student("Genady", "Sidorov", 1);
        Student st6 = new Student("Oly", "Titova", 5);
        Student st7 = new Student("Elena", "Milonova", 6);
//        treeMap.put(3.2, st1);
//        treeMap.put(9.3, st2);
//        treeMap.put(7.1, st3);
//        treeMap.put(9.1, st4);
//        treeMap.put(5.1, st5);
//        treeMap.put(1.1, st6);
//        treeMap.put(0.1, st7);
        treeMap.put(st1, 3.2);
        treeMap.put(st2, 9.3);
        treeMap.put(st3, 7.1);
        treeMap.put(st4, 9.1);
        treeMap.put(st5, 5.1);
        treeMap.put(st6, 1.1);
        treeMap.put(st7, 0.1);
        System.out.println(treeMap);
//        System.out.println("tailMap(): " + treeMap.tailMap(9.0));
//        System.out.println("headMap(): " + treeMap.headMap(5.0));
        System.out.println("lastEntry(): " + treeMap.lastEntry());
        System.out.println("firstEntry(): " + treeMap.firstEntry());

    }
}

class Student {
    public String name;
    public String surname;
    public int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }
}

