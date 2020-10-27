package oop.polymorphism.staticPolymorphism;

import org.junit.jupiter.api.Test;


public class StaticPolymorphismTest {

    @Test
    public void testPolymorphism() {
        StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
        staticPolymorphism.test(12);
        staticPolymorphism.test(2, 3);
        double testValue = 1500;
        double result = staticPolymorphism.test(testValue);
        System.out.println("Test Result is: " + result);
    }
}