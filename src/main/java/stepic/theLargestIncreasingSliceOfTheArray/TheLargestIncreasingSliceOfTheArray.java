package stepic.theLargestIncreasingSliceOfTheArray;

/*
Срезом будем считать последовательность подряд идущих элементов массива,
где каждый следующий элемент больше предыдущего.

Для последовательности 1 2 3 1 2 5 7 1 2 1 2, существуют возрастающие срезы:
1 2 3, 1 2 5 7, 1 2, 1 2 вывести нужно срез 1 2 5 7

Для последовательности 1 2 3 1 2 5 1 2 7, существуют срезы 1 2 3, 1 2 5, 1 2 7
вывести нужно все срезы, так как они равной длины

Формат входных данных:

Дано натуральное число N, далее следуют N целых чисел.

Формат выходных данных:

В первой строке выведите длину максимального среза

Далее выведите содержание среза/срезов, разделяя элементы одним пробелом,
каждый срез с новой строки

Sample Input 1:

7
2 1 2 3 1 5 7

Sample Output 1:

3
1 2 3
1 5 7

Sample Input 2:

5
1 2 3 4 5

Sample Output 2:

5
1 2 3 4 5

Sample Input 3:

7
1 2 1 5 1 7 1

Sample Output 3:

2
1 2
1 5
1 7
 */

import java.util.Scanner;

public class TheLargestIncreasingSliceOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < num; i++)
            array[i] = sc.nextInt();

        int[] tmp = new int[array.length];

        int max = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1])
                tmp[i] = tmp[i - 1] + 1;
            else tmp[i] = 0;
            max = Math.max(tmp[i], max);
        }

        System.out.println(max + 1);

        for (int i = 0; i < array.length; i++) {
            if (tmp[i] == max) {
                for (int j = i - tmp[i]; j <= i; j++)
                    System.out.print(array[j] + " ");
                System.out.println();
            }
        }
    }
}
