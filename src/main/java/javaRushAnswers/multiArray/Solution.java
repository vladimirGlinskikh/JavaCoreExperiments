package javaRushAnswers.multiArray;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        multiArray = new int[height][0];
        while (sc.hasNext()) {
            int number = sc.nextInt();
            for (int i = 0; i < height; i++) {
                multiArray = new int[number][0];
            }
            System.out.println(Arrays.deepToString(multiArray));
        }
    }
}
