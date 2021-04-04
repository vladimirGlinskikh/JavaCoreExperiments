package javaExperiments.multithreading.thread;

public class App {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        MyThreadOne myThreadOne = new MyThreadOne();
//        myThread.start();
//        myThreadOne.start();

//        MyThreadTwo myThreadTwo = new MyThreadTwo();
//        myThreadTwo.setName("my_thread");
//        myThreadTwo.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("Name of myTreadTwo = " + myThreadTwo.getName() + "\n" +
//                "Priority of myThreadTwo = " + myThreadTwo.getPriority());
//
//        System.out.println("--------------------------");
//
//        MyThreadTwo myThreadTwo1 = new MyThreadTwo();
//        System.out.println("Name of myTreadTwo1 = " + myThreadTwo1.getName() + "\n" +
//                "Priority of myThreadTwo1 = " + myThreadTwo1.getPriority());

//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("Go go go!");

        Thread thread1 = new Thread(new MyRunnable());
        Example thread2 = new Example();
        thread1.setName("thread1");
        thread2.setName("thread2");

        thread1.start();
        thread2.start();

        thread1.join();
//        thread2.join();

        System.out.println("Exit the program");
    }
}
