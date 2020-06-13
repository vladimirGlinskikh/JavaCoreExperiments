package designPatterns.structural.adapter;

public interface SocketAdapter {
    Volt getVolt220();

    Volt getVolt12();

    Volt getVolt3();
}
