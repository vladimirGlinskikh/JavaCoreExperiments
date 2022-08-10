package multithreading.experiments_2;

import java.util.Scanner;

public class Processor extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Thread: ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}

class App {
    public static void main(String[] args) {
        Processor processor1 = new Processor();
        processor1.start();

        System.out.println("Press return to stop ...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        processor1.shutdown();

    }
}
