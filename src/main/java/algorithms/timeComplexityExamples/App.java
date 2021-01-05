package algorithms.timeComplexityExamples;

public class App {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(fun1(1_000_000));
        long end = System.currentTimeMillis();
        long sum = end - start;
        System.out.println(sum + " milliseconds");
    }

    public static int fun1(int n) {
        int i, m = 0;
        i = n;
        while (i > 0) {
            m += 1;
            i = i / 2;
        }
        return m;
    }
}
