package javaExperiments.nestedClasses.staticNestedClass;

public class App {
    public static void main(String[] args) {
        Car.Engine carEngine = new Car.Engine(512);
        System.out.println(carEngine);
        Car car = new Car("red", 4, carEngine);
        System.out.println(car);
    }
}
