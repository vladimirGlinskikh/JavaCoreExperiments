package stackoverflowAnswers.arrayObjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Bread", 26, "9/10"),
                new Product("Cheese", 36, "10/10"),
                new Product("Fish", 49, "8/10"),
                new Product("Meat", 53, "9/10"),
                new Product("Tomato", 16, "7/10")
        );

        

        products.stream()
                .map(product -> product.getName())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
