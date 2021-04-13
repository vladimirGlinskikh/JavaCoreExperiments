package algorithms.analysisOfAlgorithms;

public class App {
    private static final double[] arr = {2.4, 4.5, 6.7, 5.9};

    public static void main(String[] args) {
        System.out.println(aboveMeanCount(arr, 4.2));
    }

    public static int aboveMeanCount(double[] a, double mean) {
        int count = 0;
        for (double v : a)
            if (v > mean)
                count++;
        return count;
    }
}
