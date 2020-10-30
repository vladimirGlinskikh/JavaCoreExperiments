package javaCodingProblems.findingTheCharacterWithTheMostAppearances;

import javaCodingProblems.countingVowelsAndConsonants.Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
    private static final String TEXT = "I love Java!";
    public static void main(String[] args) {
        Pair pair = Test.maxOccurenceCharacter(TEXT);
        System.out.println("Character: " + pair.character);
    }

    public static Pair<Character, Integer> maxOccurenceCharacter(String string) {
        Map<Character, Integer> counter = new HashMap<>();
        char[] chString = string.toCharArray();

        for (int i = 0; i < chString.length; i++) {
            char currentCh = chString[i];
            if (!Character.isWhitespace(currentCh)) {
                Integer noCh = counter.get(currentCh);
                if (noCh == null) {
                    counter.put(currentCh, 1);
                } else {
                    counter.put(currentCh, ++noCh);
                }
            }
        }
        int maxOccurrences = Collections.max(counter.values());
        char maxCharacter = Character.MIN_VALUE;

        for (Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == maxOccurrences) {
                maxCharacter = entry.getKey();
            }
        }
        return Pair.of(maxCharacter, maxOccurrences);
    }
}
