package core.superinterfaces.classMembers.anotherPackage;

import core.superinterfaces.classMembers.Point;

public class Test extends Point {
    public void moveBack(int dx, int dy) {
        x -= dx;
        y -= dy;
        useCount++;
        totalUseCount++;
    }
}
