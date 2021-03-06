package javaExperiments.lambda.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class App {
    public static List<Car> createThreeCars(Supplier<Car> carSupplier) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        List<Car> ourCars = createThreeCars(() ->
                new Car("BMW", "black", 2.6));
        System.out.println(ourCars);
        System.out.println("-------------------");
        changeCar(ourCars.get(0), car -> {
            car.color = "blue";
            car.engine = 3.2;
            car.model = "Honda";
            System.out.println("change car: " + car);
        });
    }
}
