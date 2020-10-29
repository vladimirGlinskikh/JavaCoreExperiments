package oop.polymorphism.dynamicPolymorphism;

public class Car extends Vehicle {
    private Integer numberOfWheels = 4;

    @Override
    public void vehicleName() {
        System.out.println("I am a car.");
    }
}
