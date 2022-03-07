package stepic.usageOfComparatorsAndCompositionForSorting;

public class Student {
    private final int csGrade;
    private String name;

    public Student(String name, int csGrade) {
        this.name = name;
        this.csGrade = csGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCsGrade() {
        return csGrade;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", csGrade=" + csGrade +
                '}';
    }
}
