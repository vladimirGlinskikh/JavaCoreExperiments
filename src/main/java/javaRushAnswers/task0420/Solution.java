package javaRushAnswers.task0420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        // создаем коллекцию и закидываем в эту коллекцию введенные числа
        List<Integer> numbers = Arrays.asList(a, b, c);
        // в стриме есть метод sorted() который сортирует коллекцию numbers в
        // которой уже лежат наши введенные числа
        numbers.stream()
                .sorted((i1, i2) -> i2.compareTo(i1)) // сортирует по убыванию
                //.sorted((i1, i2) -> i1.compareTo(i2)) // если так, то сортирует по возрастанию
                .forEach((i) -> System.out.print(i + " ")); // тут перебираем и выводим сортированные числа, как в условии
    }
}
