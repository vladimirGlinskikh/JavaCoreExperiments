package javaExperiments.multithreading.CalableAndFuture.callable;

import java.util.concurrent.*;

public class CallableFactorialExample {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        final Future<Integer> future = executorService.submit(factorial);
        try {
            System.out.println(future.isDone());
            System.out.println("We want to get result");
            factorialResult = future.get();
            System.out.println("We were get result");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.err.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial implements Callable<Integer> {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("you are entered is wrong number");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
