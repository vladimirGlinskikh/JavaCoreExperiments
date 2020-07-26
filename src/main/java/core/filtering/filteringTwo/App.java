package core.filtering.filteringTwo;

public class App {
    public static void process(Runnable runnable) {
        runnable.run();
    }

    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("This is a lambda one");
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an a anonymous class");
            }
        };

        process(runnable1);
        process(runnable2);
        process(() -> System.out.println("This is a lambda from Runnable"));
    }
}
