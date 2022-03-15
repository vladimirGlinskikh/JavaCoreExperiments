package modernJava.streams.collapseOfDataStreams;

import java.util.Arrays;
import java.util.List;
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
    }
}
