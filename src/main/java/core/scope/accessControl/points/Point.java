package core.scope.accessControl.points;

public class Point {
    public int x, y;

    void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveAlso(int dx, int dy) {
        move(dx, dy);
    }
}
