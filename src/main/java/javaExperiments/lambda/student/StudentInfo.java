package javaExperiments.lambda.student;

import java.util.List;

public class StudentInfo {

    void checkStudents(List<Student> stList, StudentCheck stCheck) {
        for (Student s : stList) {
            if (stCheck.check(s)) {
                System.out.println(s);
            }
        }
    }

    void printStudentsOverGrade(List<Student> st, double grade) {
        for (Student s : st) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentsUnderAge(List<Student> st, int age) {
        for (Student s : st) {
            if (s.age <= age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(List<Student> st, int age, double grade, char sex) {
        for (Student s : st) {
            if (s.age <= age && s.avgGrade <= grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
