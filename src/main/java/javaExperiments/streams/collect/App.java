package javaExperiments.streams.collect;

import javaExperiments.streams.filter.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

//        Map<Integer, List<Student>> map = studentList.stream()
//                .map(element -> {
//                    element.setName(element.getName().toUpperCase());
//                    return element;
//                })
//                .collect(Collectors.groupingBy(element -> element.getCourse()));
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//        }

        Map<Boolean, List<Student>> map = studentList.stream()
                .collect(Collectors.partitioningBy(element -> element.getAvgGrade() > 8.5));
        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
