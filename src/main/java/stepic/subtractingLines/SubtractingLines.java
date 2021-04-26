package stepic.subtractingLines;

import java.util.Scanner;

public class SubtractingLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayWord = scanner.nextLine().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < arrayWord[1].length()) {
            char c = arrayWord[1].charAt(i);
            if (arrayWord[0].indexOf(c) == -1) {
                stringBuilder.append(c);
                i++;
            } else {
                arrayWord[0] = arrayWord[0].replaceFirst("" + c, "");
                arrayWord[1] = arrayWord[1].replaceFirst("" + c, "");
            }
        }
        arrayWord[0] += stringBuilder;
        System.out.println(arrayWord[0]);
    }
}
