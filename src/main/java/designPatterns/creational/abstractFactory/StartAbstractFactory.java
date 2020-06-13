package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.abstractFactory.ComputerFactory;
import designPatterns.creational.abstractFactory.abstractFactory.LaptopFactory;
import designPatterns.creational.abstractFactory.abstractFactory.ServerFactory;
import designPatterns.creational.abstractFactory.abstractFactory.TabletFactory;
import designPatterns.creational.abstractFactory.model.Computer;

public class StartAbstractFactory {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("2Gb", "500Gb", "2.6GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("4Gb", "1Tb", "3.6GHz"));
        Computer tablet = ComputerFactory.getComputer(new TabletFactory("3Gb", "128Gb", "2.2GHz"));
        System.out.println("AbstractFactory Laptop config: " + laptop);
        System.out.println("AbstractFactory Server config: " + server);
        System.out.println("AbstractFactory Tablet config: " + tablet);
    }
}
