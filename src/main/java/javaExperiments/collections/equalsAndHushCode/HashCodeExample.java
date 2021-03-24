package javaExperiments.collections.equalsAndHushCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
    public String toString() {
        return "\n" + "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course
                && Objects.equals(name, student.name)
                && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}