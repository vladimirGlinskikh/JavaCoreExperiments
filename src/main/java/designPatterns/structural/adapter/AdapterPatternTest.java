package designPatterns.structural.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testClassAdapter();
        System.out.println("--------------------------");
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt volt3 = getVolt(socketAdapter, 3);
        Volt volt12 = getVolt(socketAdapter, 12);
        Volt volt220 = getVolt(socketAdapter, 220);

        System.out.println("3v volts using Object Adapter = " + volt3.getVolts());
        System.out.println("12v volts using Object Adapter = " + volt12.getVolts());
        System.out.println("220v volts using Object Adapter = " + volt220.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt volt3 = getVolt(socketAdapter, 3);
        Volt volt12 = getVolt(socketAdapter, 12);
        Volt volt220 = getVolt(socketAdapter, 220);

        System.out.println("3v volts using Class Adapter = " + volt3.getVolts());
        System.out.println("12v volts using Class Adapter = " + volt12.getVolts());
        System.out.println("220v volts using Class Adapter = " + volt220.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3:
                return socketAdapter.getVolt3();
            case 12:
                return socketAdapter.getVolt12();
            default:
                return socketAdapter.getVolt220();
        }
    }
}
