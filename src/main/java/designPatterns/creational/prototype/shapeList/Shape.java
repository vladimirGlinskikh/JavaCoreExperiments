package designPatterns.creational.prototype.shapeList;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {

    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape))
            return false;
        Shape shape = (Shape) obj;
        return shape.x == x
                && shape.y == y
                && Objects.equals(shape.color, color);
    }
}
