package functionalJava.imperative;

import java.util.ArrayList;
import java.util.List;

import static functionalJava.imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vladimir", MALE),
                new Person("Julia", FEMALE),
                new Person("Andrey", MALE),
                new Person("Luba", FEMALE),
                new Person("Nikolay", MALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }
    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
