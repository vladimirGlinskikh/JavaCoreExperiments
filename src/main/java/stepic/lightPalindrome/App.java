package stepic.lightPalindrome;

/*
 Палиндро́м (от др.-греч. πάλιν — «назад, снова» и др.-греч. δρóμος — «бег, движение»),
 пе́ревертень[1] — число, буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.

Дана строка. Из данной строки необходимо сделать палиндром следующим образом:

Берем исходную строку и к ней добавляем ее же, но в обратном порядке.

Например дано abcde, тогда ответ abcdeedcba
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder buffer = new StringBuilder(line);
        StringBuilder s = buffer.reverse();

        System.out.println(line + s);
    }
}
