package solid.interfaceSegregationPrinciple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyBuilderTest {

    @Test
    void buildToyHouse() throws Exception {
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }

    @Test
    void buildToyCar() throws Exception {
        ToyCar toyCar = ToyBuilder.buildToyCar();
        System.out.println(toyCar);
    }

    @Test
    void buildToyPlane() throws Exception {
        ToyPlane toyPlane = ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }
}