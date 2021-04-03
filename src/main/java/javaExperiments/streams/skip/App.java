package javaExperiments.streams.skip;

import javaExperiments.streams.filter.Student;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Vladimir", 'm', 38, 3, 9.4);
        Student student2 = new Student("Svetlana", 'f', 35, 4, 9.1);
        Student student3 = new Student("Nikolay", 'm', 37, 2, 8.1);
        Student student4 = new Student("Elena", 'f', 32, 1, 7.9);
        Student student5 = new Student("Alexander", 'm', 40, 1, 4.9);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        studentList.stream()
                .filter(element -> element.getAge() > 32)
                .forEach(System.out::println);
        System.out.println("-------------------------");
        studentList.stream()
                .filter(element -> element.getAge() > 32)
                .limit(2)
                .forEach(System.out::println);
        System.out.println("-------------------------");
        studentList.stream()
                .filter(element -> element.getAge() > 32)
                .skip(3)
                .forEach(System.out::println);
        System.out.println("--------------------------");
    }
}
