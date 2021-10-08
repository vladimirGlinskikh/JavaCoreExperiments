package functionalJava.streams;

import java.util.List;
import java.util.function.Predicate;

import static functionalJava.streams.StreamExample.Gender.FEMALE;
import static functionalJava.streams.StreamExample.Gender.MALE;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vladimir", MALE),
                new Person("Julia", FEMALE),
                new Person("Andrey", MALE),
                new Person("Luba", FEMALE),
                new Person("Nikolay", MALE)
        );

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        final Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .anyMatch(personPredicate);
        System.out.println(containsOnlyFemales);
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
