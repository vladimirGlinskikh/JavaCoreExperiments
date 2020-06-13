package designPatterns.structural.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt getVolt220() {
        return getVolt();
    }

    @Override
    public Volt getVolt12() {
        Volt volt = getVolt();
        return convertVolt(volt, 18);
    }

    @Override
    public Volt getVolt3() {
        Volt volt = getVolt();
        return convertVolt(volt, 73);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}
