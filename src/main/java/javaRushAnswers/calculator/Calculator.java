package javaRushAnswers.calculator;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    void calculate(int value1, int value2) {
        System.out.println("Введите целое число от 0 до 10:");
        if (value1 >= 0 || value2 <= 10)
            value1 = scanner.nextInt();
        System.out.println("Введи оператор:");
        String operation = scanner.next();
        System.out.println("Введи целое число от 0 до 10:");
        value2 = scanner.nextInt();
        System.out.println("Результат:");

        switch (operation) {
            case "+" -> System.out.println(value1 + value2);
            case "-" -> System.out.println(value1 - value2);
            case "*" -> System.out.println(value1 * value2);
            case "/" -> System.out.println(value1 / value2);
            default -> System.out.println("исключение");
        }
    }
}
