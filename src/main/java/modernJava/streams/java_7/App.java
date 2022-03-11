package modernJava.streams.java_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        getLowCaloricDishesNameInJava7()
                .forEach(System.out::println);
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
