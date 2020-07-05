package core.inner.memberInner;

public class Car {
    private final int year;

    public class Tire {
        private final double radius;

        public Tire(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
    }

    public Car(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
