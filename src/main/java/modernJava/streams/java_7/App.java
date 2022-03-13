package modernJava.streams.java_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

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
    }

    private static List<Dishes> getSliceMenu() {
        return Dishes.menu.stream()
                .dropWhile(dishes -> dishes.getCalories() < 400)
                .collect(Collectors.toList());
    }

    private static List<String> getThreeHighCaloricDishNames() {
        return Dishes.menu.stream()
                .filter(dishes -> dishes.getCalories() > 300)
                .map(Dishes::getName)
                .limit(3)
                .collect(Collectors.toList());
    }

    private static Map<Dishes.Type, List<Dishes>> getDishesByType() {
        return Dishes.menu.stream()
                .collect(Collectors.groupingBy(Dishes::getType));
    }

    private static List<String> getLowCaloricDishesNameInJava8() {
        return Dishes.menu.stream()
                .filter(dishes -> dishes.getCalories() < 400)
                .sorted(comparing(Dishes::getCalories))
                .map(Dishes::getName)
                .collect(Collectors.toList());
    }

    private static List<String> getLowCaloricDishesNameInJava7() {
        List<Dishes> lowCaloricDishes = new ArrayList<>();
        for (Dishes dish : Dishes.menu) {
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
