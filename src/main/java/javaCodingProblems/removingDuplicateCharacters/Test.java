package javaCodingProblems.removingDuplicateCharacters;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("I love Java!"));
    }

    public static String removeDuplicates(String string) {
//        char[] chArray = string.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (char ch : chArray) {
//            if (stringBuilder.indexOf(String.valueOf(ch)) == -1) {
//                stringBuilder.append(ch);
//            }
//        }
//        return stringBuilder.toString();

//        char[] chArray = string.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder();
//        Set<Character> chHashSet = new HashSet<>();
//
//        for (char c : chArray) {
//            if (chHashSet.add(c)) {
//                stringBuilder.append(c);
//            }
//        }
//        return stringBuilder.toString();

        return Arrays.asList(string.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
