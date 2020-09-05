package core.classDeclaration;

abstract class Point {
    int x = 1, y = 1;

    void move(int dx, int dy) {
        x += dx;
        y += dy;
        alert();
    }

    abstract void alert();
}

abstract class ColoredPoint extends Point {
    int color;
}

class SimplePoint extends Point {
    //Point point2 = new Point();// not correct because class Point is abstract
    Point point = new Point() {// correct
        @Override
        void alert() {

        }
    };

    Point point1 = new SimplePoint();// correct

    @Override
    void alert() {

    }
}
