package algorithms.timeComplexityExamples;

public class App {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(fun1(1_000));
        long end = System.currentTimeMillis();
        long sum = end - start;
        System.out.println(sum + " milliseconds");
    }

    public static int fun1(int n) {
        int i, j, m = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                m += 1;
            }
        }
        return m;
    }
}
