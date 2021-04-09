package javaExperiments.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Vladimir", callBox);
        new Person("Elena", callBox);
        new Person("Nikolay", callBox);
        new Person("Svetlana", callBox);
        new Person("Angelina", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " is wait...");
        try {
            callBox.acquire();
            System.out.println(name + " is used phone");
            sleep(2000);
            System.out.println(name + " call is ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}
