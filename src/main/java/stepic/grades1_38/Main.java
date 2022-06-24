package stepic.grades1_38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] grades = new int[4];

        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(reader.readLine());
            ++grades[input - 2];
        }

        System.out.println(IntStream.of(0, 1, 2, 3)
                .map(i -> grades[i])
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}

