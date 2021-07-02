package functionalInterfaces.traversingObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Car {
    private final String make;
    private final String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Nissan", "Sentra"),
                new Car("Chevrolet", "Vega"),
                new Car("Hyundai", "Elantra")
        );
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    @Override
    public String toString() {
        return make + " " + model;
    }
}
