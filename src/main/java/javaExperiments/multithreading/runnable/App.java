package javaExperiments.multithreading.runnable;

public class App {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThreadOne myThreadOne = new MyThreadOne();
        myThread.run();
        myThreadOne.run();
    }
}
