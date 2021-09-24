package oop.inheritance;

public class PersonExample {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Vladimir Glinskikh", 50_000, 1979, 10, 1);
        people[1] = new Student("Lyba Kim", "computer science");

        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
