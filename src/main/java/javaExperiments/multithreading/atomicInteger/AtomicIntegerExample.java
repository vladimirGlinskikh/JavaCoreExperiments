package javaExperiments.multithreading.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
//        counter.incrementAndGet();
        counter.addAndGet(-5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new RunnableImpl());
        Thread thread2 = new Thread(new RunnableImpl());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}


class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerExample.increment();
        }
    }
}