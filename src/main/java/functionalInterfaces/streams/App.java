package functionalInterfaces.streams;

import functionalInterfaces.comparingObjects.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static functionalInterfaces.comparingObjects.App.removeVowels;

public class App {
    public static void main(String[] args) {
//        Stream<Integer> tenRandomNumbers =
//                Stream.generate(() -> (new Random()).nextInt(100)).limit(10);
//        tenRandomNumbers.forEach(System.out::println);

//        Stream.of("RED", "GREEN", "BLUE", "RED")
//                .filter(x -> x.equals("RED"))
//                .forEach(System.out::println);

//        Predicate<String> isRed = x -> x.equals("RED");
//        Stream.of("RED", "GREEN", "BLUE", "RED")
//                .filter(isRed.or(x -> x.indexOf("L") > -1))
//                .forEach(System.out::println);

//        List<String> list = Arrays.asList("RED", "BLUE", "GREEN");
//        list.stream()
//                .filter(x -> x.equals("GREEN"))
//                .forEach(System.out::println);

//        Optional.of("BLUE")
//                .stream()
//                .forEach(System.out::println);

//        Stream.of("One", "Two", "Three", "Four")
//                .sorted()
//                .forEach(System.out::println);

//        Stream.of("a", "b", "d", "c")
//                .sorted((x, y) ->
//                        removeVowels(x).compareTo(removeVowels(y)))
//                .forEach(x -> System.out.println(x));

//        Stream.of("one", "two", "three", "four", "five")
//                .min((x, y) ->
//                        removeVowels(x).compareTo(removeVowels(y)))
//                .ifPresent(System.out::println);

//        Stream.of("one", "two", "three", "four", "five")
//                .max((x, y) ->
//                        removeVowels(x).compareTo(removeVowels(y)))
//                .ifPresent(System.out::println);

//        Stream.of(new Class("Biology",
//                        new Student("Joe", 1001, 3.81),
//                        new Student("Mary", 1002, 3.91)),
//                new Class("Physics",
//                        new Student("Kalpana", 1003, 3.61),
//                        new Student("Javier", 1004, 3.71)))
//                .flatMap(x -> x.students.stream())
//                .forEach(System.out::println);

        Stream.of(new Class("Biology",
                        new Student("Joe", 1001, 3.81),
                        new Student("Mary", 1002, 3.91)),
                new Class("Physics",
                        new Student("Kalpana", 1003, 3.61),
                        new Student("Javier", 1004, 3.71)))
                .map(x -> x.students)
                .forEach(System.out::println);
    }
}
