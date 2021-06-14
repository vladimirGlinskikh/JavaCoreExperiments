package stepic.palindrome;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (isPalindrome(word)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isPalindrome(String string) {
        return IntStream.range(0, string.length() / 2)
                .noneMatch(p -> string.charAt(p) !=
                        string.charAt(string.length() - p - 1));
    }
}
