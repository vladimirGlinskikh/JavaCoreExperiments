package designPatterns.factory.factory;

import designPatterns.factory.model.Computer;
import designPatterns.factory.model.Laptop;
import designPatterns.factory.model.Server;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String ssd, String cpu) {
        if ("Laptop".equalsIgnoreCase(type)) {
            return new Laptop(ram, ssd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, ssd, cpu);
        }
        return null;
    }
}
