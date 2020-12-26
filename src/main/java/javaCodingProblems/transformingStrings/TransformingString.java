package javaCodingProblems.transformingStrings;

import java.util.stream.Stream;

public class TransformingString {
    public static void main(String[] args) {
        System.out.println(resultMap);
    }
    public static String resultMap = Stream.of("hello ")
//            .map(s -> s + " Java!")
            .map(String::toUpperCase)
            .map(s -> s.repeat(3))
            .findFirst()
            .get();
}
