package javaExperiments.multithreading.interruption;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread is started...");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("Main thread is end");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1_000_000_000; i++) {
            if (isInterrupted()){
                System.out.println("This thread is wanted interrupted");
                System.out.println("We made sure that the condition of" +
                        " all objects is normal and decided to complete all streams.");
                String s = String.format("%.2f", sqrtSum);
                System.out.println(s);
                return;
            }

            sqrtSum = Math.sqrt(i);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.err.println("The stream wants to be interrupted during sleep," +
                        " let's complete its work");
                String s = String.format("%.2f", sqrtSum);
                System.out.println(s);
                return;
            }
        }
    }
}
