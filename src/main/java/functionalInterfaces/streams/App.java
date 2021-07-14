package functionalInterfaces.streams;

import java.util.Random;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<Integer> tenRandomNumbers =
                Stream.generate(() -> (new Random()).nextInt(100)).limit(10);
        tenRandomNumbers.forEach(System.out::println);
    }
}
