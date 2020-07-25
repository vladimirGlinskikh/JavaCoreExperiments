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
                new Apple(120, GREEN),
                new Apple(170, RED),
                new Apple(180, GREEN));

        List<Apple> greenApples = filterApplesByColor(inventory, GREEN);
        System.out.println(greenApples);
        List<Apple> redApples = filterApplesByColor(inventory, RED);
        System.out.println(redApples);
//        List<Apple> heavyApples1 = filterApplesByWeight(inventory, 150);
//        System.out.println(heavyApples1);
        List<Apple> heavyApples = filter(inventory, new AppleWeightPredicate());
        System.out.println(heavyApples);
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

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() >= weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filter(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
