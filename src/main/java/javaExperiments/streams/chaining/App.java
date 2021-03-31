package javaExperiments.streams.chaining;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 1, 0, 7, 8};
        int result = Arrays.stream(array)
                .filter(element -> element % 2 == 1)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                })
                .reduce((accumulator, element) -> accumulator + element).getAsInt();
        System.out.println(result);
    }
    // filter
    // 3, 5, 1, 7
    // map
    // 1, 5, 1, 7
    // result
    // 1 + 5 + 1 + 7 = 14
    //result = 14
}
