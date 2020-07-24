package core.filtering.filteringTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static core.filtering.filteringTwo.Color.GREEN;
import static core.filtering.filteringTwo.Color.RED;

public class Main {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(90, GREEN),
                new Apple(150, RED),
                new Apple(120, GREEN));

        List<Apple> greenApples = filterApplesByColor(inventory, GREEN);
        System.out.println(greenApples);
        List<Apple> redApples = filterApplesByColor(inventory, RED);
        System.out.println(redApples);
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }
}
