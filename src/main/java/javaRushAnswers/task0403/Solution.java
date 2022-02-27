package javaRushAnswers.task0403;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        int enterNumber = 0;
        while (!stop) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                enterNumber += number;
            } else if (scanner.hasNextLine()) {
                String enter = scanner.nextLine();
                stop = enter.equals("ENTER");
            }
        }
        System.out.println(enterNumber);
    }
}