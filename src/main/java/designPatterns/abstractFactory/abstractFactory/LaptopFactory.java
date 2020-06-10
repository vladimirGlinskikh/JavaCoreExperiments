package designPatterns.abstractFactory.abstractFactory;

import designPatterns.abstractFactory.model.Computer;
import designPatterns.abstractFactory.model.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {
    private String ram;
    private String ssd;
    private String cpu;

    public LaptopFactory(String ram, String ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(ram, ssd, cpu);
    }
}
