package designPatterns.abstractFactory.model;

public class Laptop extends Computer {
    private String ram;
    private String ssd;
    private String cpu;

    public Laptop(String ram, String ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getSSD() {
        return this.ssd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
