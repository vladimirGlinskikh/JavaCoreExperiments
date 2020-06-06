package designPatterns.factory;

import designPatterns.factory.factory.ComputerFactory;
import designPatterns.factory.factory.ComputerType;
import designPatterns.factory.model.Computer;

public class StartFactory {
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.createComputer(ComputerType.LAPTOP,
                "Lenovo ", "2Gb ", "500Gb ", "3.2GHz");
        Computer server = ComputerFactory.createComputer(ComputerType.SERVER,
                "Linux ", "4Gb ", "500Gb ", "3.6GHz");
        Computer tablet = ComputerFactory.createComputer(ComputerType.TABLET,
                "Prestigio ", "4Gb ", "500Gb ", "3.6GHz");
        Computer mobile = ComputerFactory.createComputer(ComputerType.MOBILE,
                "Sumsung ", "4Gb ", "120Gb ", "3.6GHz");
        System.out.println(laptop);
        System.out.println(server);
        System.out.println(tablet);
        System.out.println(mobile);
    }
}
