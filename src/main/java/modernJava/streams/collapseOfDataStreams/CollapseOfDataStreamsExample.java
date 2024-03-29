package modernJava.streams.collapseOfDataStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollapseOfDataStreamsExample {
    public static void main(String[] args) {
        List<String> arrayOfWords = Arrays.asList("Hello", "modern", "java");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        arrayOfWords.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::print);

        System.out.println();
        System.out.println("---------------------------------");

        numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------------------");

        Optional<Integer> firstSquareDivisibleByThree =
                numbers.stream()
                        .map(n -> n * n)
                        .filter(n -> n % 3 == 0)
                        .findFirst();
        System.out.println(firstSquareDivisibleByThree);
        System.out.println("---------------------------------");

        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum);
        System.out.println(sum);
        System.out.println("---------------------------------");


    }
}
