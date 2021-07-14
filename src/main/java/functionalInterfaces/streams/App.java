package functionalInterfaces.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

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

        Optional.of("BLUE")
                .stream()
                .forEach(System.out::println);
    }
}
