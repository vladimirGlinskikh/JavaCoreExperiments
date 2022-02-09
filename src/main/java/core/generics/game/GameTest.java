package core.generics.game;

public class GameTest {
    public static void main(String[] args) {
        SchoolChildren schoolChildren1 = new SchoolChildren("Vladimir", 12);
        SchoolChildren schoolChildren2 = new SchoolChildren("Svetlana", 11);
        SchoolChildren schoolChildren3 = new SchoolChildren("Olya", 13);
        SchoolChildren schoolChildren4 = new SchoolChildren("Nikolay", 14);

        Student student1 = new Student("Alexander", 13);
        Student student2 = new Student("Elena", 14);

        Employee employee1 = new Employee("Boris", 23);
        Employee employee2 = new Employee("Maria", 27);

        Team<SchoolChildren> schoolTeam = new Team<>("SchoolsGo");
        Team<Student> studentTeam = new Team<>("StudentsGo");
        Team<Employee> employeeTeam = new Team<>("AdultsGo");

        Team<SchoolChildren> schoolTeam2 = new Team<>("SchoolsGo2");
        Team<Student> studentTeam2 = new Team<>("StudentsGo2");
        Team<Employee> employeeTeam2 = new Team<>("AdultsGo2");

        schoolTeam.addNewParticipant(schoolChildren1);
        schoolTeam.addNewParticipant(schoolChildren2);

        schoolTeam2.addNewParticipant(schoolChildren3);
        schoolTeam2.addNewParticipant(schoolChildren4);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolTeam.playWith(schoolTeam2);
    }
}
