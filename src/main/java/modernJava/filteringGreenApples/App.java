package modernJava.filteringGreenApples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) ||
                    (!flag && apple.getWeight() > weight)) {
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

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));

//        List<Apple> greenApples = filterGreenApples(inventory);
//        System.out.println(greenApples);

//        List<Apple> greenApples = filterApplesByColor(inventory, GREEN);
//        List<Apple> redApples = filterApplesByColor(inventory, RED);
//        System.out.println(greenApples);
//        System.out.println(redApples);

//        List<Apple> appleWeight = filterApplesByWeight(inventory, 110);
//        System.out.println(appleWeight);

        List<Apple> greenApples = filterApples(inventory, GREEN, 0, true);
        List<Apple> heavyApples = filterApples(inventory, RED, 130, false);
        System.out.println(greenApples);
        System.out.println(heavyApples);
    }
}