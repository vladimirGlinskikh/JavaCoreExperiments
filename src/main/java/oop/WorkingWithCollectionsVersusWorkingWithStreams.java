package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class WorkingWithCollectionsVersusWorkingWithStreams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> odds = new ArrayList<>();
        for (int val : list) {
            if (val % 2 == 0)
                odds.add(val);
        }

        for (int val : odds) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");

//        in the same think where we see a little less code

        IntStream
                .range(0, 10)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> i + " ")
                .forEach(System.out::print);
    }
}
