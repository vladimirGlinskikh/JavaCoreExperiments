package modernJava.filteringGreenApples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static modernJava.filteringGreenApples.Color.GREEN;
import static modernJava.filteringGreenApples.Color.RED;

public class App {
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
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

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED),
                new Apple(160, Color.RED));

        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
        );

        List<String> list = Arrays.asList(
                "One",
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven"
        );

//        List<Apple> greenApples = filterGreenApples(inventory);
//        System.out.println(greenApples);

//        List<Apple> greenApples = filterApplesByColor(inventory, GREEN);
//        List<Apple> redApples = filterApplesByColor(inventory, RED);
//        System.out.println(greenApples);
//        System.out.println(redApples);

//        List<Apple> appleWeight = filterApplesByWeight(inventory, 110);
//        System.out.println(appleWeight);

//        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());
//        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());
//        System.out.println(greenApples);
//        System.out.println(heavyApples);

//        List<Apple> redAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
//        System.out.println(redAndHeavyApples);

//        prettyPrintApple(inventory, new AppleFancyFormatter());
//        prettyPrintApple(inventory, new AppleSimpleFormatter());

//        List<Apple> result = filterApples(inventory, (Apple apple) -> RED.equals(apple.getColor()));
//        System.out.println(result);

//        List<Apple> redApples = filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));
//        System.out.println(redApples);
//
//        List<Integer> evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);
//        System.out.println(evenNumbers);
//
//        List<String> evenList = filter(list, (String s) -> s.charAt(0) == 'S');
//        System.out.println(evenList);

//        inventory.sort(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight().compareTo(o2.getWeight());
//            }
//        });
        inventory.sort(
                (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight())
        );
        System.out.println(inventory);
    }
}
