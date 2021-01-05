package algorithms.timeComplexityExamples;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        System.out.println(fun1(1_000_000));
        long end = System.nanoTime();
        long sum = end - start;
        System.out.println(sum);

        long convert = TimeUnit.SECONDS.convert(sum, TimeUnit.NANOSECONDS);

        System.out.println(convert + " seconds");
    }

    public static int fun1(int n) {
        int m = 0;
        for (int i = 0; i < n; i++) {
            m += 1;
        }
        return m;
    }
}
