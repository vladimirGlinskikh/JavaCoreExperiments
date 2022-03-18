package modernJava.streams.minAndMax;

import java.util.*;

public class MinExample {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 8, 2, 9, 3, 5);

        Optional<Integer> min = array.stream()
                .reduce(Integer::min);
        System.out.println(min);
        System.out.println("------------------------");

        Optional<Integer> max = array.stream()
                .reduce(Integer::max);
        System.out.println(max);
    }
}
