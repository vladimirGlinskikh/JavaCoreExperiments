package modernJava.streams.generateWithStream;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream
                .generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
