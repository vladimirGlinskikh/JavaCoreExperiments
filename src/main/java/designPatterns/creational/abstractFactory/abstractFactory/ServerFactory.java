package designPatterns.creational.abstractFactory.abstractFactory;

import designPatterns.creational.abstractFactory.model.Computer;
import designPatterns.creational.abstractFactory.model.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String ssd;
    private String cpu;

    public ServerFactory(String ram, String ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, ssd, cpu);
    }
}
