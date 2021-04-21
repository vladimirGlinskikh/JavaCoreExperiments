package stepic.sortTheArrayInAscendingOrder;


/*
Дано натуральное число N, далее следуют N целых чисел.
Необходимо вывести на консоль отсортированную последовательность.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortTheArrayInAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNumber = sc.nextInt();
        int[] array = new int[arrNumber];

        for (int i = 0; i < arrNumber; i++) {
            array[i] = sc.nextInt();
        }

        for (int j = 0; j < array.length; j++){
            Arrays.sort(array);
            System.out.print(array[j] + " ");
        }
    }
}

