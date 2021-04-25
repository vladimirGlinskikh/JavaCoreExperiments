package stepic.lineInput;

/*
Программа получает на вход строку из 2 слов, разделенных пробелом.

Необходимо вывести слово, меньшее в лексикографическом порядке.
 */

import java.util.Scanner;

public class LineInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineWord = sc.nextLine();

        String[] arrayWord = lineWord.split(" ");

        for (int i = 0; i < arrayWord.length; i++) {
            for (int j = i + 1; j < arrayWord.length; j++) {
                if (arrayWord[i].compareTo(arrayWord[j]) > 0) {
                    String tmp = arrayWord[i];
                    arrayWord[i] = arrayWord[j];
                    arrayWord[j] = tmp;
                }
            }
            System.out.println(arrayWord[i]);
            break;
        }
    }
}
