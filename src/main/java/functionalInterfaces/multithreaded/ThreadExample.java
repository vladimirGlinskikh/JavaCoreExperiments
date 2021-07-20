package functionalInterfaces.multithreaded;

import java.util.Scanner;

public class ThreadExample extends Thread {
    public ThreadExample() {
        start();
    }

    public static void main(String[] args) throws InterruptedException {
        new ThreadExample();
    }

    public void run() {
        try (Scanner buff = new Scanner(System.in)) {
            int count = 0;
            boolean exit = false;
            while (!exit) {
                String line = buff.nextLine();
                if (line.equals("N")) {
                    exit = true;
                } else {
                    int number = Integer.parseInt(line);
                    count += number;
                }
            }
            System.out.println(count);
        }
    }
}
