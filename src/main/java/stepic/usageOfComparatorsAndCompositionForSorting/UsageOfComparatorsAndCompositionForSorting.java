package stepic.usageOfComparatorsAndCompositionForSorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UsageOfComparatorsAndCompositionForSorting {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Mary", 82),
                new Student("Alisa", 100),
                new Student("Antonio", 85),
                new Student("John", 100),
                new Student("Vladimir", 94),
                new Student("Elizabet", 97),
                new Student("Francis", 85)
        );

        students.sort(
                Comparator.comparing(Student::getCsGrade, Comparator.reverseOrder())
                        .thenComparing(Student::getName));
        System.out.println(students);
    }
}
