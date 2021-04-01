package javaRushAnswers.task0504;

import java.util.Arrays;

public class App {
    public static int[] firstArray = {1, 2, 7, 8, 4, 0, 3, 5, 6, 9};
    public static int[] secondArray = {23, 12, 78, 45, 232, 90, 21, 89, 75, 107};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = concatArray(firstArray, secondArray);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] concatArray(int[] firstArray, int[] secondArray) {
        if (firstArray == null) {
            return secondArray;
        }
        if (secondArray == null) {
            return firstArray;
        }
        int[] resultArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
        return resultArray;
    }
}
