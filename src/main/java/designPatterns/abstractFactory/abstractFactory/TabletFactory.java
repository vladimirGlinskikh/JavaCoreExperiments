package designPatterns.abstractFactory.abstractFactory;

import designPatterns.abstractFactory.model.Computer;
import designPatterns.abstractFactory.model.Tablet;

public class TabletFactory implements ComputerAbstractFactory {
    private String ram;
    private String ssd;
    private String cpu;

    public TabletFactory(String ram, String ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Tablet(ram, ssd, cpu);
    }
}
