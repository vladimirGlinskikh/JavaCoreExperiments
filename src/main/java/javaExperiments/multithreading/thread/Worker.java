package javaExperiments.multithreading.thread;

public class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Work started");
        try {
            Thread.sleep(2_500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work is ends");
    }
}
