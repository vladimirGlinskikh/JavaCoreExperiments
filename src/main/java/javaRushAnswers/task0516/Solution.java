package javaRushAnswers.task0516;

import java.util.Arrays;

public class Solution {
    public static int[] array = new int[9];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int arr = (int) Math.ceil((array.length + 1) / 2);
        Arrays.fill(array, 0, arr, valueStart);
        Arrays.fill(array, arr, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
