package modernJava.streams.java_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        getLowCaloricDishesNameInJava7(Dishes.menu)
                .forEach(System.out::println);
    }

    private static List<String> getLowCaloricDishesNameInJava7(List<Dishes> dishes) {
        List<Dishes> lowCaloricDishes = new ArrayList<>();
        for (Dishes dish : dishes) {
            if (dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }

        Collections.sort(lowCaloricDishes, new Comparator<Dishes>() {
            @Override
            public int compare(Dishes dish1, Dishes dish2) {
                return Integer.compare(dish1.getCalories(), dish2.getCalories());
            }
        });

        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dishes dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.getName());
        }
        return lowCaloricDishesName;
    }
}
