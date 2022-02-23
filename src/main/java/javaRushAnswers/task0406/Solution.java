package javaRushAnswers.task0406;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            System.out.println(line);
            if (line.equals("enough"))
                break;
        }
    }
}
