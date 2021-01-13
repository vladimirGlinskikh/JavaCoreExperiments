package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingTheIndexInTheRangeFromZeroToLength;

public class Function {
    private final int X_UPPER_BOUND = 11;
    private final int Y_UPPER_BOUND = 16;
    private final int x;

    public Function(int x) {
        if (x < 0 || x >= X_UPPER_BOUND) {
            throw new IndexOutOfBoundsException("...");
        }
        this.x = x;
    }

    public int xMinusY(int y) {
        if (y < 0 || y >= x) {
            throw new IndexOutOfBoundsException("...");
        }
        return x - y;
    }

    public int oneMinusY(int y) {
        if (y < 0 || y >= Y_UPPER_BOUND) {
            throw new IndexOutOfBoundsException("...");
        }
        return 1 - y;
    }
}
