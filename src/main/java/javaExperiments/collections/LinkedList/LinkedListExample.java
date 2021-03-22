package javaExperiments.collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        Student st1 = new Student("One", 5);
        Student st2 = new Student("Two", 3);
        Student st3 = new Student("Three", 1);
        Student st4 = new Student("Four", 4);
        Student st5 = new Student("Five", 2);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println("LinkedList: " + "\n" + list);
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
                "name='" + name + '\'' +
                ", course=" + course +
                '}' + "\n";
    }
}
