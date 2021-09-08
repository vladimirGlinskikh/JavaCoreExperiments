package stepic.thePercentageOfGAndCCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Double> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        char[] wordOnChar = word.toCharArray();

        double count = 0;
        for (int i = 0; i < wordOnChar.length; i++) {
            if (!map.containsKey(wordOnChar[i])) {
                map.put(wordOnChar[i], count);
            }
            if (wordOnChar[i] == 'g' || wordOnChar[i] == 'c') {
                map.put(wordOnChar[i], map.get(wordOnChar[i]) + 1);
                count++;
            }
        }
        System.out.println((count / wordOnChar.length) * 100);
        scanner.close();
    }
}
