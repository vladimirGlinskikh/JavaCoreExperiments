package javaCodingProblems.stringsAndNumbers.computingTheMinimumAndMaximumOfTwoNumbers;

import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) {
        int i1 = -45;
        int i2 = -15;
        int min = Math.min(i1, i2);
        int max = Math.max(i1, i2);
        System.out.println(min);
        System.out.println(max);
        System.out.println("------------------");
        double d1 = 0.023844D;
        double d2 = 0.35468856D;
        double min1 = Double.min(d1, d2);
        double max2 = Double.max(d1, d2);
        System.out.println(min1);
        System.out.println(max2);
        System.out.println("--------------------");
        float f1 = 33.34F;
        final float f2 = 33.213F;
        float min3 = BinaryOperator.minBy(Float::compare).apply(f1, f2);
        float max4 = BinaryOperator.maxBy(Float::compare).apply(f1, f2);
        System.out.println(min3);
        System.out.println(max4);
    }
}
