package core.superinterfaces.classMembers;

public class Point {
    public int x, y;
    protected int useCount = 0;
    static protected int totalUseCount = 0;

//    private Point() {
//        reset();
//    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    private void reset() {
        this.x = 0;
        this.y = 0;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        useCount++;
        totalUseCount++;
    }
}
