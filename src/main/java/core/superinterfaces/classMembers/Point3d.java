package core.superinterfaces.classMembers;

public class Point3d extends Point {
    int z;

    protected Point3d(int x, int y) {
        super(x, y);
    }

    public void move(int dx, int dy, int dz) {
        x += dx;
        y += dy;
        z += dz;
    }
}
