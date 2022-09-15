package stepic.transposing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static int[][] multiArray;
    public static int[][] transposed;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int weight = scanner.nextInt();
        multiArray = new int[height][weight];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                multiArray[i][j] = scanner.nextInt();
            }
        }

        transposed = transposedMatrix(multiArray);

        Arrays.stream(transposed).map(iter -> Arrays.stream(iter)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")))
                .forEach(System.out::println);
    }

    private static int[][] transposedMatrix(int[][] multiArray) {
        int height = multiArray.length;
        int weight = multiArray[0].length;
        int[][] transposedMatrix = new int[weight][height];
        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < height; j++) {
                transposedMatrix[i][j] = multiArray[j][i];
            }
        }
        return transposedMatrix;
    }
}
