package designPatterns.creational.prototype.shapeList.cache;

import designPatterns.creational.prototype.shapeList.Circle;
import designPatterns.creational.prototype.shapeList.Rectangle;
import designPatterns.creational.prototype.shapeList.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 35;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 12;
        rectangle.y = 10;
        rectangle.width = 8;
        rectangle.height = 9;
        rectangle.color = "Red";

        cache.put("Big green circle", circle);
        cache.put("Medium red rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
