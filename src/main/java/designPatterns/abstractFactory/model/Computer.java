package designPatterns.abstractFactory.model;

public abstract class Computer {
    public abstract String getRam();

    public abstract String getSSD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM = " + this.getRam()
                + ", SSD = " + this.getSSD()
                + ", CPU = " + this.getCPU();
    }
}
