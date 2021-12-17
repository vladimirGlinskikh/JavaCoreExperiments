package stepic.starFigure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[][] array = new String[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == number / 2
                        || j == number / 2
                        || j == i
                        || number - j == i + 1) {
                    array[i][j] = "* ";
                } else {
                    array[i][j] = ". ";
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
