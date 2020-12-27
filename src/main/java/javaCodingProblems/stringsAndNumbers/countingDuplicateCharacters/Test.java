package javaCodingProblems.stringsAndNumbers.countingDuplicateCharacters;

import java.util.HashMap;
import java.util.Map;

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

//    public static Map<Character, Long> countDuplicateCharacters(String string) {
//        Map<Character, Long> result = string.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        return result;
//    }

    public static Map<String, Integer> countDuplicateCharacters(String string) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
//            int cp = string.codePointAt(i);
//            String ch = String.valueOf(Character.toChars(cp));
//            if (Character.charCount(cp) == 2) {
//                i++;
//            }
            String ch = String.valueOf(Character.toChars(string.codePointAt(i)));
            if (i < string.length() - 1 && string.codePointCount(i, i + 2) == 1) {
                i++;
            }
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
