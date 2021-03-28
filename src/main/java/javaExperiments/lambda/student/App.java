package javaExperiments.lambda.student;

import java.util.ArrayList;
import java.util.List;

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

        StudentInfo studentInfo = new StudentInfo();

        studentInfo.checkStudents(studentList, new StudentCheck() {
            @Override
            public boolean check(Student student) {
                return student.age > 35;
            }
        });

        System.out.println("-------------------");
        studentInfo.checkStudents(studentList, (Student st) -> st.avgGrade > 8);


//        studentInfo.printStudentsOverGrade(studentList, 8);
//        System.out.println("--------------");
//        studentInfo.printStudentsUnderAge(studentList, 35);
//        System.out.println("-----------------");
//        studentInfo.printStudentsMixCondition(studentList, 34, 8.0, 'f');
//        System.out.println("-----------------");
    }
}
