package javaExperiments.nestedClasses.innerClass;

public class App {
    public static void main(String[] args) {
        Car car = new Car("orange", 3);
        Car.Engine engine = car.new Engine(700);
        car.setEngine(engine);
        System.out.println(car);
        System.out.println(engine);
    }
}
