package modernJava.streams.java_7;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static modernJava.streams.java_7.Dishes.menu;

public class App {
    public static void main(String[] args) {
        getLowCaloricDishesNameInJava7()
                .forEach(System.out::println);

        System.out.println("-----------------------------");

        getLowCaloricDishesNameInJava8()
                .forEach(System.out::println);

        System.out.println("-----------------------------");

        System.out.println(getDishesByType());

        System.out.println("-----------------------------");

        getThreeHighCaloricDishNames()
                .forEach(System.out::println);

        System.out.println("-----------------------------");

        getSliceMenu()
                .forEach(System.out::println);

        System.out.println("-----------------------------");

        getSkipThreeHighCaloricDishNames()
                .forEach(System.out::println);

        System.out.println("-----------------------------");

        isVegetarianChecking();

        System.out.println("-----------------------------");

        whetherMenusGoodForYourHealth();

        System.out.println("-----------------------------");

        findAnyVegetarianDish();
    }

    private static void findAnyVegetarianDish() {
        menu.stream()
                .filter(Dishes::isVegetarian)
                .findAny()
                .ifPresent(dishes -> System.out.println(dishes.getName()));
    }

    private static void whetherMenusGoodForYourHealth() {
        if (menu.stream()
//                .allMatch(dishes -> dishes.getCalories() < 1_000))
                .noneMatch(dishes -> dishes.getCalories() <= 700)) {
            System.out.println("The menu is good for your health");
        } else {
            System.out.println("The menu is not good for your health");
        }
    }

    private static void isVegetarianChecking() {
        if (menu.stream()
                .anyMatch(Dishes::isVegetarian)) {
            System.out.println("The menu is (somewhat) vegetarian friendly!");
        }
    }

    private static List<Dishes> getSkipThreeHighCaloricDishNames() {
        return menu.stream()
                .filter(dishes1 -> dishes1.getCalories() > 300)
                .skip(3)
                .collect(Collectors.toList());
    }

    private static List<Dishes> getSliceMenu() {
        return menu.stream()
                .dropWhile(dishes -> dishes.getCalories() < 400)
                .collect(Collectors.toList());
    }

    private static List<String> getThreeHighCaloricDishNames() {
        return menu.stream()
                .filter(dishes -> dishes.getCalories() > 300)
                .map(Dishes::getName)
                .limit(3)
                .collect(Collectors.toList());
    }

    private static Map<Dishes.Type, List<Dishes>> getDishesByType() {
        return menu.stream()
                .collect(Collectors.groupingBy(Dishes::getType));
    }

    private static List<String> getLowCaloricDishesNameInJava8() {
        return menu.stream()
                .filter(dishes -> dishes.getCalories() < 400)
                .sorted(comparing(Dishes::getCalories))
                .map(Dishes::getName)
                .collect(Collectors.toList());
    }

    private static List<String> getLowCaloricDishesNameInJava7() {
        List<Dishes> lowCaloricDishes = new ArrayList<>();
        for (Dishes dish : menu) {
            if (dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }

        lowCaloricDishes.sort(Comparator.comparingInt(Dishes::getCalories));

        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dishes dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.getName());
        }
        return lowCaloricDishesName;
    }
}
