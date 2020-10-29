package javaCodingProblems.removingAGivenCharacter;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println(removeCharacter("I love Java!", 'a'));
    }

    public static String removeCharacter(String string, char ch) {
//        return string.replaceAll(Pattern.quote(String.valueOf(ch)), "");

//        StringBuilder stringBuilder = new StringBuilder();
//        char[] chArray = string.toCharArray();
//
//        for (char c : chArray) {
//            if (c != ch) {
//                stringBuilder.append(c);
//            }
//        }
//        return stringBuilder.toString();

        return string.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
