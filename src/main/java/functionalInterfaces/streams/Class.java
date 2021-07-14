package functionalInterfaces.streams;

import functionalInterfaces.comparingObjects.Student;

import java.util.Arrays;
import java.util.Collection;

public class Class {
    String subject;
    Collection<Student> students;

    public Class(String su, Student... st) {
        subject = su;
        students = Arrays.asList(st);
    }
}
