package javaExperiments.multithreading.runnable;

public class MyThreadOne implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
