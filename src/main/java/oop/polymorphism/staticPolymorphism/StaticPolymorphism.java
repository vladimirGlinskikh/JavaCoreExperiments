package oop.polymorphism.staticPolymorphism;

public class StaticPolymorphism {

    public void test(int a) {
        System.out.println("Method A - The value of a is: " + a);
    }

    public void test(int a, int b) {
        System.out.println("Method B - The values of a and b are: " + a + ", " + b);
    }

    public double test(double a) {
        System.out.println("Method C - The value of a is: " + a);
        return a * a;
    }
}
