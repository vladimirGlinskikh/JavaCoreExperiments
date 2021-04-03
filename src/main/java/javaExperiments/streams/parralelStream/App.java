package javaExperiments.streams.parralelStream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6000);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(5);
        int result = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element)
                .get();
        System.out.println("result: " + result);

        // it's wrong result
//        int result = list.parallelStream()
//                .reduce((accumulator, element) -> accumulator / element)
//                .get();
//        System.out.println("result: " + result);
    }
}
