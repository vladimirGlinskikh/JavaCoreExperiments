package javaCodingProblems.countingDuplicateCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println(countDuplicateCharacters("I love Java"));
    }

//    public static Map<Character, Integer> countDuplicateCharacters(String string) {
//        Map<Character, Integer> result = new HashMap<>();
//        for (int i = 0; i < string.length(); i++) {
//            char ch = string.charAt(i);
//            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
//        }
//        return result;
//    }

    public static Map<Character, Long> countDuplicateCharacters(String string) {
        Map<Character, Long> result = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}
