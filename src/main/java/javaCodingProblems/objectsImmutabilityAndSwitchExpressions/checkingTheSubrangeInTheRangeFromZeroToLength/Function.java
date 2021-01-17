package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingTheSubrangeInTheRangeFromZeroToLength;

public class Function {
    private static final int N_UPPER_BOUND = 101;
    private final int n;

    public Function(int n) {
        if (n < 0 || n >= N_UPPER_BOUND) {
            throw new IndexOutOfBoundsException("...");
        }
        this.n = n;
    }

    public int yMinusX(int x, int y) {
        if (x < 0 || x > y || y >= n) {
            throw new IndexOutOfBoundsException("...");
        }
        return y - x;
    }
}
