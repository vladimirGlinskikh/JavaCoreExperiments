package core.algorithms.array.classDataArray;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print(" First name: " + firstName);
        System.out.print(", Last name: " + lastName);
        System.out.println(", Age: " + age);
    }

    public String getFirst() {
        return firstName;
    }
}
