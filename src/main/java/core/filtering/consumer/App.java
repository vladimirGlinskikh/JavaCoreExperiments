package core.filtering.consumer;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        forEach(Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                (Integer i) -> System.out.println(i));
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
