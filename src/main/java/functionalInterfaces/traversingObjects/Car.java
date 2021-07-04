package functionalInterfaces.traversingObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

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
                new Car("Hyundai", "Elantra"),
                new Car("Buick", "Regal")
        );
//        Iterator<Car> iterator = cars.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        cars.iterator().forEachRemaining(System.out::println);
        Spliterator<Car> spliterator = cars.spliterator();
        spliterator.forEachRemaining(x -> System.out.println("In spliterator: " + x));
        System.out.println("---------------------");

        spliterator = cars.spliterator();
        Spliterator<Car> firstHalf = spliterator.trySplit();
        firstHalf.forEachRemaining(x -> System.out.println("In 1st half: " + x));
        spliterator.forEachRemaining(x -> System.out.println("In 2nd half: " + x));
    }

    @Override
    public String toString() {
        return make + " " + model;
    }
}
