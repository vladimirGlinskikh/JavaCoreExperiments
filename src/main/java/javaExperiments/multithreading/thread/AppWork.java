package javaExperiments.multithreading.thread;

public class AppWork {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main started");
        Thread thread = new Thread(new Worker());
        System.out.println("Thread states: " + thread.getState());
        thread.start();
        System.out.println("Thread states: " + thread.getState());
        thread.join();
        System.out.println("Thread states: " + thread.getState());
        System.out.println("Method main is ends");
    }
}
