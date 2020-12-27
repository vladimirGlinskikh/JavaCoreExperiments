package javaCodingProblems.stringsAndNumbers.countingVowelsAndConsonants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Strings {

    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

//    public static Pair<Integer, Integer> countVowelAndConsonants(String string) {
//        string = string.toLowerCase();
//        int vowels = 0;
//        int consonants = 0;
//
//        for (int i = 0; i < string.length(); i++) {
//            char ch = string.charAt(i);
//            if (allVowels.contains(ch)) {
//                vowels++;
//            } else if ((ch >= 'a' && ch <= 'z')) {
//                consonants++;
//            }
//        }
//        return Pair.of(vowels, consonants);
//    }

    public static Pair<Long, Long> countVowelAndConsonants(String string) {
        string = string.toLowerCase();
        long vowels = string.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();

        long consonants = string.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();

        return Pair.of(vowels, consonants);
    }
}
