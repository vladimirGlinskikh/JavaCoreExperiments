package javaCodingProblems.sortingAnArrayOfStringsByLength;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class Test {
    private static String[] strs = {"one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten"};

    public static void main(String[] args) {
        System.out.println("Initial (unsorted):" + Arrays.toString(strs));

        long startTime = System.nanoTime();

//        sortArrayByLength(strs, Sort.DESC);

        String[] resultFunc = sortArrayByLength(strs, Sort.ASC);

        displayExecutionTime(System.nanoTime() - startTime);
        System.out.println("Sorted desc: " + Arrays.toString(resultFunc));

        System.out.println();
    }

//    public static void sortArrayByLength(String[] strings, Sort direction) {
////        if (direction.equals(Sort.ASC)) {
////            Arrays.sort(strings, (String s1, String s2)
////                    -> Integer.compare(s1.length(), s2.length()));
////        } else {
////            Arrays.sort(strings, (String s1, String s2)
////                    -> (-1) * Integer.compare(s1.length(), s2.length()));
////        }
//
//        if (direction.equals(Sort.ASC)) {
//            Arrays.sort(strings, Comparator.comparingInt(String::length));
//        } else {
//            Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());
//        }
//    }

    public static String[] sortArrayByLength(String[] strings, Sort direction) {
        if (direction.equals(Sort.ASC)) {
            return Arrays.stream(strings)
                    .sorted(Comparator.comparingInt(String::length))
                    .toArray(String[]::new);
        } else {
            return Arrays.stream(strings)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .toArray(String[]::new);
        }
    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ns" + " ("
                + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}
