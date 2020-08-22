package designPatterns.creational.abstractFactory.buttons;

public class Main {
    private static Application configureApplication() {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("Mac")) {
            factory = new MacOsFactory();
            application = new Application(factory);
        } else {
            factory = new WindowsFactory();
            application = new Application(factory);
        }
        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
