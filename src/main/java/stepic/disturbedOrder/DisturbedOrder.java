package stepic.disturbedOrder;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
Дано целое число N, не превосходящее 1000.
Далее следуют N целых чисел.
Порядок нарушен тогда, когда среди двух соседних элементов массива
левый элемент больше правого.
Программа должна считать количество нарушенных порядков в массиве и
выводить это количество на экран.
 */

public class DisturbedOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNumber = sc.nextInt();
        int[] array = new int[arrNumber];

        for (int i = 0; i < arrNumber; i++) {
            array[i] = sc.nextInt();
        }

        int count = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j - 1] > array[j]) {
                count++;
            }
        }
        System.out.print(count);

        // another solution with lambda expression

//        Scanner sc = new Scanner(System.in);
//        int arrNumber = sc.nextInt();
//        int[] array = IntStream
//                .range(0, arrNumber)
//                .map(i -> sc.nextInt()).toArray();
//
//        int count = (int) IntStream
//                .range(1, array.length)
//                .filter(j -> array[j - 1] > array[j])
//                .count();
//        System.out.print(count);
    }
}
