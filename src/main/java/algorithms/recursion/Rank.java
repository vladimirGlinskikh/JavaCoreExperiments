package algorithms.recursion;

import java.util.Arrays;

public class Rank {
    public int rank(int key, int[] a, int lo, int hi) {
        Arrays.sort(a);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        }
        else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        }
        else {
            System.out.println(Arrays.toString(a));
            return mid;
        }
    }
}
