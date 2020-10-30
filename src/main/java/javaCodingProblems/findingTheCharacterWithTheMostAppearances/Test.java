package javaCodingProblems.findingTheCharacterWithTheMostAppearances;

import javaCodingProblems.countingVowelsAndConsonants.Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Test {
    private static final String TEXT = "I love Java!";

    public static void main(String[] args) {
        Pair pair = Test.maxOccurenceCharacter(TEXT);
        System.out.println("Character: " + pair.character);
    }

//    public static Pair<Character, Integer> maxOccurenceCharacter(String string) {
//        Map<Character, Integer> counter = new HashMap<>();
//        char[] chString = string.toCharArray();
//
//        for (int i = 0; i < chString.length; i++) {
//            char currentCh = chString[i];
//            if (!Character.isWhitespace(currentCh)) {
//                Integer noCh = counter.get(currentCh);
//                if (noCh == null) {
//                    counter.put(currentCh, 1);
//                } else {
//                    counter.put(currentCh, ++noCh);
//                }
//            }
//        }
//        int maxOccurrences = Collections.max(counter.values());
//        char maxCharacter = Character.MIN_VALUE;
//
//        for (Entry<Character, Integer> entry : counter.entrySet()) {
//            if (entry.getValue() == maxOccurrences) {
//                maxCharacter = entry.getKey();
//            }
//        }
//        return Pair.of(maxCharacter, maxOccurrences);
//    }

    public static Pair<Character, Long> maxOccurenceCharacter(String string) {
        return string.chars()
                .filter(c -> Character.isWhitespace(c) == false)
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(p -> Pair.of(p.getKey(), p.getValue()))
                .orElse(Pair.of(Character.MIN_VALUE, -1L));
    }
}
