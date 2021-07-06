package functionalInterfaces.collections.populatingAnArray;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;

public class PopulatingAnArrayExample {
    public static void main(String[] args) {
        setAll(0, null);
        System.out.println("---------------");
        setAll(new double[0], null);
        System.out.println("---------------");
        setAll(new String[]{""}, null);
    }

    static void setAll(int array, IntUnaryOperator generator) {
        IntUnaryOperator iop = x -> x * 2;
        int[] iarr = new int[5];
        Arrays.setAll(iarr, iop);
        for (int i : iarr)
            System.out.println(i);
    }

    static void setAll(double[] array, IntToDoubleFunction generator) {
        IntToDoubleFunction i2d = x -> (new Random()).nextFloat() * 2;
        double[] darr = new double[5];
        Arrays.setAll(darr, i2d);
        for (double d : darr)
            System.out.println(d);
    }

    static <X> void setAll(X[] array, IntFunction<? extends X> generator) {
        IntFunction<String> is = x -> {
            String s = "";
            for (int i = 0; i <= x; ++i)
                s += "F";
            return s;
        };
        String[] sarr = new String[5];
        Arrays.setAll(sarr, is);
        for (String s : sarr)
            System.out.println(s);
    }
}
