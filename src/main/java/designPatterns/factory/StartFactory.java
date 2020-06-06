package designPatterns.factory;

import designPatterns.factory.factory.ComputerFactory;
import designPatterns.factory.model.Computer;

public class StartFactory {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer("computer", "4 Gb", "1Tb", "3.2 Ghz");
        Computer server = ComputerFactory.getComputer("server", "8 Gb", "500 Gb", "2.4 GHz");
        System.out.println("Factory computer config: " + computer);
        System.out.println("Factory server config: " + server);
    }
}
