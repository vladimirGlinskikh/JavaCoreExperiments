package javaExperiments.streams.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(9);
        Optional<Integer> optional = list.stream()
                .reduce((accumulator, element) -> accumulator * element);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Optional is empty!");
        }
    }
}
