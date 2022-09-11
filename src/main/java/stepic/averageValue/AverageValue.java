package stepic.averageValue;

import java.util.*;
import java.util.stream.IntStream;

public class AverageValue {
    public static void main(String[] args) {
        IntStream.Builder builder = IntStream.builder();
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            do {
                builder.add(number);
                number = scanner.nextInt();
            } while (number != 0);
            System.out.println(builder.build().average().getAsDouble());
        }
    }
}
