package oop.polymorphism.dynamicPolymorphism;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DynamicPolymorphismTest {
    @Test
    public void testDynamicPolymorphism() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle());
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Corvette());

        for (Vehicle vehicle : vehicles) {
            vehicle.vehicleName();
        }
    }
}
