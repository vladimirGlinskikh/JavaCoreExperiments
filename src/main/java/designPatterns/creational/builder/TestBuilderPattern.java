package designPatterns.creational.builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder(
                "500Gb", "4Gb")
                .setWiFiEnabled(true)
                .setGraphicsCardEnable(true)
                .build();
        System.out.println(computer);
    }
}
