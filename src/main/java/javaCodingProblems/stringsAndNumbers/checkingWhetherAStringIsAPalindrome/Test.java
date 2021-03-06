package javaCodingProblems.stringsAndNumbers.checkingWhetherAStringIsAPalindrome;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        System.out.println(isPalindrome("I love Java"));
    }

    public static boolean isPalindrome(String string) {
        return IntStream.range(0, string.length() / 2)
                .noneMatch(p -> string.charAt(p) !=
                        string.charAt(string.length() - p - 1));
    }
}
