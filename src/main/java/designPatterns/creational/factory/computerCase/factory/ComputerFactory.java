package designPatterns.creational.factory.computerCase.factory;

import designPatterns.creational.factory.computerCase.model.*;

public class ComputerFactory {

    public static Computer createComputer(ComputerType type, String name, String ram, String ssd, String cpu) {
        Computer computer = null;
        switch (type) {
            case LAPTOP:
                computer = new Laptop(name, ram, ssd, cpu);
                break;
            case SERVER:
                computer = new Server(name, ram, ssd, cpu);
                break;
            case TABLET:
                computer = new Tablet(name, ram, ssd, cpu);
                break;
            case MOBILE:
                computer = new Mobile(name, ram, ssd, cpu);
                break;
        }
        return computer;
    }
}
