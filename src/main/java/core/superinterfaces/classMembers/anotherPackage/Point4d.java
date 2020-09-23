package core.superinterfaces.classMembers.anotherPackage;

import core.superinterfaces.classMembers.Point3d;

public class Point4d extends Point3d {
    int w;

    public Point4d(int x, int y) {
        super(x, y);
    }

    public void move(int dx, int dy, int dz, int dw) {
        super.move(dx, dy, dz);
        w += dw;
    }
}
