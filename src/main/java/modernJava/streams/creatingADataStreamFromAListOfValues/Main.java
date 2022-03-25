package modernJava.streams.creatingADataStreamFromAListOfValues;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("I ", "Love ", "Programming ", "In ", "Java");
        stream.map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
