package core.algorithms.stdOut;

import java.util.Random;

public class StdRandom {
    private static Random random;
    private static long seed;

    static {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    public static double uniform(double lo, double hi) {
        if (!(lo < hi)) {
            throw new IllegalArgumentException("invalid range: [" + lo + ", " + hi + ")");
        }
        return lo + uniform() * (hi - lo);
    }

    private static double uniform() {
        return random.nextDouble();
    }
}
