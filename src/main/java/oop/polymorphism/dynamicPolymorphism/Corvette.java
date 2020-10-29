package oop.polymorphism.dynamicPolymorphism;

public class Corvette extends Car {
    protected String manufacturer = "General Motors";
    private Integer numberOfWheels;
    private Boolean hasSupercharger;

    @Override
    public void vehicleName() {
        System.out.println("Zoom, zoom, I'm a Corvette.");
    }

    public void goFast() {
        System.out.println("Zoom...");
    }
}
