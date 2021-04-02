package javaRushAnswers.task0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        for (int i = a.length - 1; i >= 0; i--) {
            int b = Integer.parseInt(bufferedReader.readLine());
            a[i] = b;
        }
        System.out.println(Arrays.toString(a));
    }
}
