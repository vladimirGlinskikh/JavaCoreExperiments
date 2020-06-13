package designPatterns.structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt getVolt220() {
        return socket.getVolt();
    }

    @Override
    public Volt getVolt12() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 18);
    }

    @Override
    public Volt getVolt3() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 73);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}
