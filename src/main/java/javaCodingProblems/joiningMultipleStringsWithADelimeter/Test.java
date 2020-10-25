package javaCodingProblems.joiningMultipleStringsWithADelimeter;

import java.util.StringJoiner;

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

        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));
        for (String arg : args) {
            joiner.add(arg);
        }
        return joiner.toString();
    }
}
