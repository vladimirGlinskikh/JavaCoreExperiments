package designPatterns.factory.model;

public class Server implements Computer {
    private String name;
    private String ram;
    private String ssd;
    private String cpu;

    public Server(String name, String ram, String ssd, String cpu) {
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    @Override
    public String getName() {
        return this.name;
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
        return "Server{" +
                "name='" + name + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
