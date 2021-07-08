package functionalInterfaces.comparingObjects;

public class Student {
    String name;
    Integer id;
    Double gpa;

    public Student(String name, Integer id, Double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + gpa;
    }
}
