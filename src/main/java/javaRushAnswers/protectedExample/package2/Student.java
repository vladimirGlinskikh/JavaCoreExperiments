package javaRushAnswers.protectedExample.package2;

import javaRushAnswers.protectedExample.package1.Person;

class Student extends Person {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: " + student.firstName + " " + student.lastName);
        System.out.println("Email: " + student.email);
        System.out.println("Age: " + student.age);
    }
}
