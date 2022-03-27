package modernJava.streams.creatingADataStreamFromArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 6, 1, 9};
        int sum = Arrays.stream(numbers)
                .sum();
        System.out.println(sum);
    }
}
