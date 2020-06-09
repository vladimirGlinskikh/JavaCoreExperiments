package designPatterns.abstractFactory;

import designPatterns.abstractFactory.abstractFactory.ComputerFactory;
import designPatterns.abstractFactory.abstractFactory.LaptopFactory;
import designPatterns.abstractFactory.abstractFactory.ServerFactory;
import designPatterns.abstractFactory.model.Computer;

public class StartAbstractFactory {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("2Gb", "500Gb", "2.6GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("4Gb", "1Tb", "3.6GHz"));
        System.out.println("AbstractFactory Laptop config: " + laptop);
        System.out.println("AbstractFactory Server config: " + server);
    }
}
