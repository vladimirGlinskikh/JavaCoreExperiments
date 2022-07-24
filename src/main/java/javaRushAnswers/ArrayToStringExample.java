package javaRushAnswers;

import java.util.Arrays;

public class ArrayToStringExample {
    public static void main(String[] args) {
        String[] arrayString = {"1", "2", "a"};
        int[] arrayInt = {1, 2, 3};
        float[] arrayFloat = {1f, 3f, 2f};


        System.out.println(Arrays.toString(arrayString));
        System.out.println(arrayInt.toString());
        System.out.println(arrayFloat.toString());
    }
}
