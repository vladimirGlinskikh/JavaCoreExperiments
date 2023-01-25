package multithreading.experiment_3;

public class Intro {
    private final Object monitor = new Object();
    private volatile int count = 0;

    public static void main(String[] args) {
        new Intro().doCounter();
    }

    private void increment() {
        synchronized (monitor) {
            count++;
        }
    }

    private void doCounter() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
            System.out.println("count = " + count + " thread_1");
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
            System.out.println("count = " + count + " thread_2");
        });

        thread1.start();
        thread2.start();
    }
}
