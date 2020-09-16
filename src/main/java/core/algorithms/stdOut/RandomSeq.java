package core.algorithms.stdOut;

public class RandomSeq {
    public static void main(String[] args) {
        int N = Integer.parseInt("5");
        double lo = Double.parseDouble("100.0");
        double hi = Double.parseDouble("200.0");
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            System.out.printf("%.2f\n", x);
        }
    }
}
