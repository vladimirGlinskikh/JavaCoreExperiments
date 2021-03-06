package javaExperiments.lambda.student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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
        double res = avgOfSmth(studentList, student -> student.avgGrade);
        System.out.println(res);

//        studentInfo.checkStudents(studentList, new StudentCheck() {
//            @Override
//            public boolean check(Student student) {
//                return student.age > 35;
//            }
//        });

//        System.out.println("-------------------");
//        studentInfo.checkStudents(studentList, (Student st) -> st.avgGrade > 8);
//        System.out.println("--------------------");
//        studentInfo.checkStudents(studentList, predicate -> predicate.sex == 'f');
//        System.out.println("--------------------");
//        Predicate<Student> predicate1 = student -> student.course > 3;
//        studentInfo.checkStudents(studentList, predicate1);
//        System.out.println("-----------------");
//        Predicate<Student> predicate2 = student -> student.age <= 35;
//        studentInfo.checkStudents(studentList, predicate2);
//        System.out.println("-----------------");
//        studentInfo.checkStudents(studentList, predicate1.and(predicate2));
//        System.out.println("---------------");
//        studentInfo.checkStudents(studentList, predicate1.or(predicate2));
//        System.out.println("---------------");
//        studentInfo.checkStudents(studentList, predicate1.negate());
//        System.out.println("---------------");


//        studentInfo.printStudentsOverGrade(studentList, 8);
//        System.out.println("--------------");
//        studentInfo.printStudentsUnderAge(studentList, 35);
//        System.out.println("-----------------");
//        studentInfo.printStudentsMixCondition(studentList, 34, 8.0, 'f');
//        System.out.println("-----------------");
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s : list) {
            result += f.apply(s);
        }
        result = result / list.size();
        return result;
    }
}
