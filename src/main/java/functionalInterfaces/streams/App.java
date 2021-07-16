package functionalInterfaces.streams;

import functionalInterfaces.comparingObjects.Student;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
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

//        Stream.of(new Class("Biology",
//                        new Student("Joe", 1001, 3.81),
//                        new Student("Mary", 1002, 3.91)),
//                new Class("Physics",
//                        new Student("Kalpana", 1003, 3.61),
//                        new Student("Javier", 1004, 3.71)))
//                .map(x -> x.students)
//                .forEach(System.out::println);

//        Stream.of(1, 2, 3, 4, 5)
//                .reduce((x, y) -> x * y)
//                .ifPresent(System.out::println);

//        Stream<TwoInts> two = Stream.of(new TwoInts(1, 2), new TwoInts(8, 12));
//        BiFunction<Integer, TwoInts, Integer> accumulator = (x, y) -> x + y.i2;
//        BinaryOperator<Integer> combiner = (x, y) -> x += y;
//        Integer j = two.reduce(0, accumulator, combiner);
//        System.out.println(j);

        BiConsumer<List<Character>, Character> acc = (x, y) -> {
            System.out.print("acc: x = " + x + " y = " + y + " result = ");
            if (Character.isAlphabetic(y))
                x.add(0, y);
            else
                x.add(y);
            x.forEach(z -> System.out.print(z));
            System.out.println();
        };

        BinaryOperator<List<Character>> comb1 = (x, y) -> {
            x.addAll(y);
            return x;
        };

        Supplier<List<Character>> supp = () -> new ArrayList<>();

        Stream.of('1', 'a', 'b', '2')
                .collect(Collector.of(supp, acc, comb1))
                .forEach(System.out::println);
    }
}
