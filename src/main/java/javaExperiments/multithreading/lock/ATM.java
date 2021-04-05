package javaExperiments.multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Vladimir", lock);
        new Employee("Svetlana", lock);
        new Employee("Nikolay", lock);
        new Employee("Elena", lock);
        new Employee("Angela", lock);
    }
}

class Employee extends Thread {
    private final Lock lock;
    String name;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " wait...");
            lock.lock();
            System.out.println(name + " used ATM...");
            Thread.sleep(2000);
            System.out.println(name + " is completed his affairs");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
