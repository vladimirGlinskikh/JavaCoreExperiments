package javaRushAnswers.multithreading;

class Deadlock implements Runnable {
    public static final Object lock = new Object();
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();

        synchronized (lock) {
            a.foo(b); // get lock on a in this thread.
            System.out.println("Back in main thread");
        }
    }

    public static void main(String[] args) {
        new Deadlock();
    }

    public void run() {
        synchronized (lock) {
            b.bar(a); // get lock on b in other thread.
            System.out.println("Back in other thread");
        }
    }

    class A {
        void foo(B b) {
            String name = Thread.currentThread().getName();

            System.out.println(name + " entered A.foo");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("A Interrupted");
            }

            System.out.println(name + " trying to call B.last()");
            b.last();
        }

         void last() {
            System.out.println("Inside A.last");
        }
    }

    class B {
        void bar(A a) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " entered B.bar");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("B Interrupted");
            }

            System.out.println(name + " trying to call A.last()");
            a.last();
        }

         void last() {
            System.out.println("Inside A.last");
        }
    }
}
