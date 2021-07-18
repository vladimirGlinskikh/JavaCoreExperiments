package functionalInterfaces.multithreaded;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class InfiniteStream {
    private static Semaphore semaphore = new Semaphore(0);
    private static int number;

    public static void main(String[] args) throws InterruptedException {
        Consumer<Integer> acquire = x -> {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {

            }
        };

        Runnable runnable = () -> {
            Stream.generate(() -> (new Random()).nextInt(100))
                    .peek(acquire)
                    .forEach(x -> number = x);
        };

        Thread generator = new Thread(runnable);
        generator.setDaemon(true);
        generator.start();

        Supplier<Boolean> finished = () -> {
            Scanner input = new Scanner(System.in);
            System.out.print("Do you want another number" + "(Y for yes):");
            return input.nextLine().charAt(0) != 'Y';
        };
        do {
            semaphore.release();
            Thread.sleep(1000);
            System.out.println("The number is " + number);
        } while (!finished.get());
    }
}
