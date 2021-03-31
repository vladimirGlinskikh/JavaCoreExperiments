package javaExperiments.streams.filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Vladimir", 'm', 38, 3, 9.4);
        Student student2 = new Student("Svetlana", 'f', 35, 4, 9.1);
        Student student3 = new Student("Nikolay", 'm', 37, 2, 8.1);
        Student student4 = new Student("Elena", 'f', 32, 1, 7.9);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

//        studentList = studentList.stream()
//                .filter(element -> element.getAge() > 25 && element.getAvgGrade() <= 9.5)
//                .collect(Collectors.toList());
//        System.out.println(studentList);
//
//        studentList = studentList.stream()
//                .sorted(Comparator.comparing(Student::getCourse))
//                .collect(Collectors.toList());
//        System.out.println(studentList);

        studentList.stream()
                .peek(element -> element.setName(element.getName().toUpperCase()))
                .filter(element -> element.getSex() == 'f')
                .sorted(Comparator.comparingInt(Student::getAge))
                .forEach(System.out::println);
    }
}
