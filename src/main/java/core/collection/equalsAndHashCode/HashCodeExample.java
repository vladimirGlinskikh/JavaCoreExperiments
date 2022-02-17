package core.collection.equalsAndHashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Vladimir", "Glinskikh", 3);
        Student student2 = new Student("Svetlana", "Kim", 2);
        Student student3 = new Student("Elena", "Oleina", 1);
        map.put(student1, 4.5);
        map.put(student2, 3.7);
        map.put(student3, 4.2);
        System.out.println(map);

        Student student4 = new Student("Vladimir", "Glinskikh", 3);
        boolean result = map.containsKey(student4);
        System.out.println("result = " + result);
        System.out.println(student1.equals(student4));
        System.out.println("----------------------");

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student4.hashCode());
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
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
