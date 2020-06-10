package designPatterns.abstractFactory.abstractFactory;

import designPatterns.abstractFactory.model.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
