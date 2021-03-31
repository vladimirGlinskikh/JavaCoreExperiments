package javaExperiments.streams.sorted;
import javaExperiments.streams.filter.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 9, 1, 3, 4, 2, 0};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
