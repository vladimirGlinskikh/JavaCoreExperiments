package core.scope.accessControl.morepoints;

import core.scope.accessControl.points.Point;

public class PlusPoint extends Point {

    public void move(int dx, int dy) {
        //super.move(dx, dy);// compile time error
        moveAlso(dx, dy);
    }
}
