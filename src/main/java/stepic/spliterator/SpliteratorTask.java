package stepic.spliterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class SpliteratorTask {
    public static void main(String[] args) throws IOException {
//        System.out.println(spliteratorWork(Arrays.stream(
//                        new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
//                .map(Double::parseDouble)
//                .collect(Collectors.toList())));
        spliteratorWork(Arrays.asList(1.0, 4.0, 8.0, 16.0, 99.0, 100.0, 110.0, 121.0));
    }

    public static List<Double> spliteratorWork(List<Double> lst) {
        List<Double> stream = lst.stream()
                .filter(x -> x > 0)
                .map(Math::sqrt)
                .collect(Collectors.toList());

        List<Double> sqrs = new ArrayList<>();
        sqrs.addAll(stream);
        print(sqrs);
        return sqrs;
    }

    public static void print(List<Double> list) {
        Spliterator<Double> spliterator1 = list.spliterator();
        Spliterator<Double> spliterator2 = spliterator1.trySplit();


        spliterator2.forEachRemaining(x -> {
            if (x >= 2) {
                System.out.println(x);
            }
        });
        System.out.println();

        spliterator1.forEachRemaining(n -> {
            if (n >= 10) {
                System.out.println(n);
            }
        });
    }
}
