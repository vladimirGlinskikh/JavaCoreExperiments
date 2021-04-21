package stepic.arrayDataProcessing;

import java.util.Arrays;
import java.util.Scanner;

/*
Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.
Среди всех чисел массива, необходимо вывести на экран двузначные, четные и положительные через пробел.
А если таких чисел в массиве нет, необходимо вывести -1.

 Sample Input 1:
 5
 100 96 -2 96 1

 Sample Output 1:
 96 96

 */

public class ArrayDataProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNumber = sc.nextInt();
        int[] array = new int[arrNumber];
        boolean flag = false;

        for (int j = 0; j < arrNumber; j++) {
            array[j] = sc.nextInt();
            if (array[j] < 100 && array[j] > 9 && array[j] %2 == 0) {
                System.out.print(array[j] + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.print(-1);
        }
    }
}
