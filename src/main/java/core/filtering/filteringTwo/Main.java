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

        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 6, 9, 10
        );

//        List<Apple> greenApples = filterApplesByColor(inventory, GREEN);
//        System.out.println(greenApples);
//        List<Apple> redApples = filterApplesByColor(inventory, RED);
//        System.out.println(redApples);
//        List<Apple> heavyApples1 = filterApplesByWeight(inventory, 150);
//        System.out.println(heavyApples1);
//        List<Apple> heavyApples = filter(inventory, new AppleWeightPredicate());
//        System.out.println(heavyApples);
//        List<Apple> redAndHeavyApples = filterApplesByColor(inventory, RED);
//        System.out.println(redAndHeavyApples);
//        List<Apple> greenAndHeavyApples = filterApples(inventory, new AppleGreenAndHeavyPredicate());
//        System.out.println(greenAndHeavyApples);

        List<Apple> redApples =
                filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));
        System.out.println(redApples);

        List<Apple> greenApple =
                filter(inventory, (Apple apple) -> GREEN.equals(apple.getColor()));
        System.out.println(greenApple);

        List<Integer> num =
                filter(numbers, (Integer i) -> i % 2 == 0);
        System.out.println(num);
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (apple.getColor().equals(color)) {
//                result.add(apple);
//            }
//        }
//        return result;
        List<Apple> result =
                filterApples(inventory, (Apple apple) -> RED.equals(apple.getColor()));
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

//    public static List<Apple> filter(List<Apple> inventory, ApplePredicate predicate) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (predicate.test(apple)) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
}
