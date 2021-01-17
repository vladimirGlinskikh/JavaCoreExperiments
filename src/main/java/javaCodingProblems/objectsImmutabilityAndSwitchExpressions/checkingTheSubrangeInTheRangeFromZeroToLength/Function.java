package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingTheSubrangeInTheRangeFromZeroToLength;

import java.util.Objects;

public class Function {
    private static final int N_UPPER_BOUND = 101;
    private final int n;

    public Function(int n) {
//        if (n < 0 || n >= N_UPPER_BOUND) {
//            throw new IndexOutOfBoundsException("...");
//        }
//        this.n = n;
        this.n = Objects.checkIndex(n, N_UPPER_BOUND);
    }

    public int yMinusX(int x, int y) {
//        if (x < 0 || x > y || y >= n) {
//            throw new IndexOutOfBoundsException("...");
//        }
        Objects.checkFromToIndex(x, y, n);
        return y - x;
    }

    public static void main(String[] args) {
        Function function = new Function(40);
        int res = function.yMinusX(10, 40);
        System.out.println(res);
    }
}
