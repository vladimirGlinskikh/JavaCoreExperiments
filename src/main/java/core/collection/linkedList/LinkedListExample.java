package core.collection.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        Student student = new Student("Vladimir", 3);
        Student student1 = new Student("Svetlana", 1);
        Student student2 = new Student("Nikolay", 4);
        Student student3 = new Student("Elena", 2);

        List<Student> students = new LinkedList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("---------------");
        System.out.println(students.get(3));
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", course=" + course +
                "}" + "\n";
    }
}