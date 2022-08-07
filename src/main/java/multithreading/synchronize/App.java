package multithreading.synchronize;

public class App {
    private int count = 0;

    public static void main(String[] args) {
        App app = new App();
        app.doWork();
    }

    public synchronized void increment() {
        count++;
    }

    public void doWork() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Count is: " + count);
    }
}
