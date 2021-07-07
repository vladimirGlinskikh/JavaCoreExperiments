package functionalInterfaces.collections.parallelComputationsOnArrays;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class App {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 0, 12};
        IntBinaryOperator operator = (x, y) -> x * y;

        Arrays.parallelPrefix(array, operator);
        for (int i : array)
            System.out.println(i);
    }
}
