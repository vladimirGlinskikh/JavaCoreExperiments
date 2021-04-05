package javaExperiments.multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(call::mobileCall);
        Thread thread2 = new Thread(call::skypeCall);
        Thread thread3 = new Thread(call::whatsappCall);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private final Lock lock = new ReentrantLock();

    public void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts...");
            Thread.sleep(3000);
            System.out.println("Mobile call ends...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts...");
            Thread.sleep(5000);
            System.out.println("Skype call ends...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void whatsappCall() {
        lock.lock();
        try {
            System.out.println("Whatsapp call starts...");
            Thread.sleep(7000);
            System.out.println("Whatsapp call ends...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
