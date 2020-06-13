package designPatterns.creational.abstractFactory.abstractFactory;

import designPatterns.creational.abstractFactory.model.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
