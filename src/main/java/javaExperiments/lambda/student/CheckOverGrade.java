package javaExperiments.lambda.student;

public class CheckOverGrade implements StudentCheck {
    @Override
    public boolean check(Student student) {
        return student.avgGrade > 8;
    }
}
