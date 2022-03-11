package modernJava.streams.java_7;

import java.util.Arrays;
import java.util.List;

public class Dishes {
    public static final List<Dishes> menu = Arrays.asList(
            new Dishes("pork", false, 800, Type.MEAT),
            new Dishes("beef", false, 700, Type.MEAT),
            new Dishes("chicken", false, 400, Type.MEAT),
            new Dishes("french fries", true, 530, Type.OTHER),
            new Dishes("rice", true, 350, Type.OTHER),
            new Dishes("season fruit", true, 120, Type.OTHER),
            new Dishes("pizza", true, 550, Type.OTHER),
            new Dishes("prawns", false, 400, Type.FISH),
            new Dishes("salmon", false, 450, Type.FISH)
    );
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dishes(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public enum Type {
        MEAT,
        FISH,
        OTHER
    }
}
