package oop.polymorphism.dynamicPolymorphism;

public class Motorcycle extends Vehicle {
    private Integer numberOfWheels = 2;

    @Override
    public void vehicleName() {
        System.out.println("I am a motorcycle.");
    }
}
