package javaCodingProblems.joiningMultipleStringsWithADelimeter;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println(joinByDelimiter(' ', "I", "love", "Java", "!"));
    }

    public static String joinByDelimiter(char delimiter, String... args) {
//        StringBuilder result = new StringBuilder();
//        int i = 0;
//        for (i = 0; i < args.length - 1; i++) {
//            result.append(args[i]).append(delimiter);
//        }
//        result.append(args[i]);
//        return result.toString();

//        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));
//        for (String arg : args) {
//            joiner.add(arg);
//        }
//        return joiner.toString();

        return Arrays.stream(args, 0, args.length)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }
}
