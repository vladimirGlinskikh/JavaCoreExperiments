package javaExperiments.streams.forEach;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 9};
//        Arrays.stream(array)
//                .forEach(element -> {
//                    element *= 3;
//                    System.out.println(element);
//                });

        Arrays.stream(array)
                .forEach(Util::someMethod);

    }
}
