package javaExperiments.multithreading.CalableAndFuture.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {
    private static Long value = 1_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResult = new ArrayList<>();
        long valueDividedByTen = value / 10;
        for (int i = 0; i < 10; i++) {
            long from = valueDividedByTen * i + 1;
            long to = valueDividedByTen * (i + 1);
            PartialSum task = new PartialSum(from, to);
            final Future<Long> futurePartSum = executorService.submit(task);
            futureResult.add(futurePartSum);
        }
        for (Future<Long> result : futureResult) {
            sum += result.get();
        }
        executorService.shutdown();
        System.out.println("Total sum = " +
                String.format("%,d", sum).replace(",", "_"));
    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from: " +
                String.format("%,d", from).replace(",", "_") + " to: " +
                String.format("%,d", to).replace(",", "_") + " = " +
                String.format("%,d", localSum).replace(",", "_"));
        return localSum;
    }
}
