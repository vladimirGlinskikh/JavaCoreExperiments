package javaExperiments.multithreading.thread;

public class App {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThreadOne myThreadOne = new MyThreadOne();
        myThread.start();
        myThreadOne.start();
    }
}
