package multithreading.experiment_3;

public class Intro {
    private final Lock lock = new Lock();
    private int count = 0;

    public static void main(String[] args) {
        new Intro().doCounter();
    }

    private void increment() {
        try {
            lock.lock();
        } catch (Exception e) {
            e.printStackTrace();
        }
        count++;
        lock.unlock();
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

class Lock {
    private boolean isLocked = false;

    void lock() throws InterruptedException {
        synchronized (this) {
            while (isLocked) {
                wait();
            }
            isLocked = true;
        }
    }

    void unlock() {
        synchronized (this) {
            isLocked = false;
            notify();
        }
    }
}
