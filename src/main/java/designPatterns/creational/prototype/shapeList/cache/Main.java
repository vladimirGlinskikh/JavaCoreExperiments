package designPatterns.creational.prototype.shapeList.cache;

import designPatterns.creational.prototype.shapeList.Shape;

public class Main {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium red rectangle");
        Shape shape3 = cache.get("Medium red rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium red rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium red rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium red rectangle are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }
}
