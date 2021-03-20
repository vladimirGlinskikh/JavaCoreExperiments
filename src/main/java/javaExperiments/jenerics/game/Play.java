package javaExperiments.jenerics.game;

public class Play {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Alex", 13);
        Schoolar schoolar2 = new Schoolar("Vlad", 14);

        Student student1 = new Student("Nickoly", 20);
        Student student2 = new Student("Michail", 21);

        Employee employee1 = new Employee("Vladimir", 34);
        Employee employee2 = new Employee("Svetlana", 31);

        Team<Schoolar> schoolarTeam = new Team("ScholarTeam");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team("StudentTeam");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team("EmployeeTeam");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam1 = new Team("ScholarTeam1");
        Schoolar schoolar3 = new Schoolar("Alexey", 12);
        Schoolar schoolar4 = new Schoolar("Vladislav", 15);
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam1);
    }
}
