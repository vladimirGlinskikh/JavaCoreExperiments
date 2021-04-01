package javaExperiments.streams.concat;

import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(2, 4, 5, 9, 1, 0, 10, 42, 23);
        Stream<Integer> stream2 = Stream.of(23, 42, 56, 97, 18, 10, 2, 0);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);

//        stream3.distinct().forEach(System.out::println);
        System.out.println(stream3./*distinct().*/count());
//        System.out.println("------------------");
//        stream3.forEach(System.out::println);
    }
}
