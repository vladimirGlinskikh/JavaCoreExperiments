package modernJava.streams.java_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class App {
    public static void main(String[] args) {
        getLowCaloricDishesNameInJava7()
                .forEach(System.out::println);

        System.out.println("-----------------------------");

        getLowCaloricDishesNameInJava8()
                .forEach(System.out::println);
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
