package javaExperiments.multithreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

//        for (int i = 0; i < 10; i++) {
//            service.execute(new RunnableImpl());
//        }
//        service.schedule(new RunnableImpl(), 3, TimeUnit.SECONDS);
//        service.scheduleAtFixedRate(new RunnableImpl(), 3, 1, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(new RunnableImpl(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        service.shutdown();
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(new RunnableImpl());
//        }
//        executorService.shutdown();
//        executorService.awaitTermination(5, TimeUnit.SECONDS);
//        System.out.println("Main method is ended");
    }
}

class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins his work");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " ends his work");
    }
}
