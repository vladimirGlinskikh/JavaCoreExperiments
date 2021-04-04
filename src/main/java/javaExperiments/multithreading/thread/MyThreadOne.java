package javaExperiments.multithreading.thread;

public class MyThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 10000; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
