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

        List<Apple> greenApples = filterGreenApples(inventory);
        System.out.println(greenApples);
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
