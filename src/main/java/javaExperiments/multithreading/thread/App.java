package javaExperiments.multithreading.thread;

public class App {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        MyThreadOne myThreadOne = new MyThreadOne();
//        myThread.start();
//        myThreadOne.start();

        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.setName("my_thread");
        myThreadTwo.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myTreadTwo = " + myThreadTwo.getName() + "\n" +
                "Priority of myThreadTwo = " + myThreadTwo.getPriority());

        System.out.println("--------------------------");

        MyThreadTwo myThreadTwo1 = new MyThreadTwo();
        System.out.println("Name of myTreadTwo1 = " + myThreadTwo1.getName() + "\n" +
                "Priority of myThreadTwo1 = " + myThreadTwo1.getPriority());
    }
}
