package core.methodDeclarations.inheritanceOverridingHiding.overriding;

public class SlowPoint extends Point {
    int xLimit, yLimit;

    @Override
    void move(int dx, int dy) {
        super.move(limit(dx, xLimit), limit(dy, yLimit));
    }

    static int limit(int d, int limit) {
        return d > limit ? limit : d < -limit ? -limit : d;
    }
}
