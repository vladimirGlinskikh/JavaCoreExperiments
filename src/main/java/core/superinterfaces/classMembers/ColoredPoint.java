package core.superinterfaces.classMembers;

public class ColoredPoint extends Point {
    int color;

    ColoredPoint(int x, int y) {
        super(x, y);
    }

    void clear() {
//        reset();// error
    }
}
