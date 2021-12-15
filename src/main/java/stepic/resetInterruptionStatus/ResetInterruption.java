package stepic.resetInterruptionStatus;

import java.util.concurrent.TimeUnit;

public class ResetInterruption implements Runnable {
    public static void main(String[] args) throws Exception {
        final Thread thread = new Thread(new ResetInterruption());
        thread.start();
        thread.join();
        System.out.printf("Interrupted %b%n", thread.isInterrupted());
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
