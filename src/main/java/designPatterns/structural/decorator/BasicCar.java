package designPatterns.structural.decorator;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("This is a basic car.");
    }
}
