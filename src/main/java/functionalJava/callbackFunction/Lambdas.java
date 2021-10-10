package functionalJava.callbackFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = name -> name.toUpperCase();
        System.out.println(upperCaseName.apply("Vladimir"));

        System.out.println("------------------------");

        BiFunction<String, Integer, String> upperCaseName1 = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName1.apply("Vladimir", 38));
    }
}
