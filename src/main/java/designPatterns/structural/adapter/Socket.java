package designPatterns.structural.adapter;

public class Socket {
    public Volt getVolt() {
        return new Volt(220);
    }
}
