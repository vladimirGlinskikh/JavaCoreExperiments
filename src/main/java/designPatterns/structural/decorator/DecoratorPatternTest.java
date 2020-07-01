package designPatterns.structural.decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();
        System.out.println("\n*****");

        Car sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
    }
}
