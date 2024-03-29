package modernJava.lambdas.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
        forEach(Arrays.asList(1,2,3,4,5,6,7),
                System.out::println);
    }
}
