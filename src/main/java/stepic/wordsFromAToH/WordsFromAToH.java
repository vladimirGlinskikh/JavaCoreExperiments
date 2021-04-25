package stepic.wordsFromAToH;

import java.util.Scanner;

/*
Вводится одна строка целиком. Необходимо вывести те слова данной строки,
которые начинаются с буквы из интервала от a до h.

Словом считается совокупность букв и символов от пробела до пробела.
Слова могут быть как в верхнем, так и нижнем регистре.

Выводить слова необходимо каждый раз с новой строки.
 */

public class WordsFromAToH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arrayWords = line.split(" ");

        for (String arrayWord : arrayWords) {
            if (arrayWord.charAt(0) >= 'a' && arrayWord.charAt(0) <= 'h') {
                System.out.println(arrayWord);
            } else if (arrayWord.charAt(0) >= 'A' && arrayWord.charAt(0) <= 'H') {
                System.out.println(arrayWord);
            }
        }
    }
}