package stepic.digitsInNumbers;

import java.util.Scanner;

/*
Дано число, необходимо вывести два числа через пробел.
Первое число - количество нечетных цифр данного числа,
второе число - произведение четных цифр данного числа.
Если четных цифр в числе нет - произведение 0.
 */
public class DigitsInNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), evenNumber = 1, oddNumber = 0;
        while (number > 0) {
            int tmp = number % 10;
            if (tmp % 2 == 0) {
                evenNumber *= tmp;
            } else {
                oddNumber++;
            }
            number /= 10;
        }
        if (evenNumber == 1) {
            evenNumber = 0;
        }
        System.out.println(oddNumber + " " + evenNumber);
    }
}
