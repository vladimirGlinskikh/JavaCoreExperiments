package designPatterns.creational.builder;

public class Computer {
    private String ssd;
    private String ram;

    private boolean isGraphicsCardEnabled;
    private boolean isWiFiEnabled;

    public String getSsd() {
        return ssd;
    }

    public String getRam() {
        return ram;
    }

    private Computer(ComputerBuilder builder) {
        this.ssd = builder.ssd;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isWiFiEnabled = builder.isWiFiEnable;
    }

    public static class ComputerBuilder {
        private String ssd;
        private String ram;

        private boolean isGraphicsCardEnabled;
        private boolean isWiFiEnable;

        public ComputerBuilder(String ssd, String ram) {
            this.ssd = ssd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnable(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setWiFiEnabled(boolean isWiFiEnable) {
            this.isWiFiEnable = isWiFiEnable;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ssd='" + ssd + '\'' +
                ", ram='" + ram + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isWiFiEnabled=" + isWiFiEnabled +
                '}';
    }
}
