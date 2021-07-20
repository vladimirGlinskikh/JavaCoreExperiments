package functionalInterfaces.multithreaded;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
//        Runnable runnable = () -> System.out.println("RED");
//        runnable.run();
//
//        (new Thread(runnable)).start();

//        Callable<String> callable = () -> "GREEN";
//        try {
//            String s = callable.call();
//            System.out.println(s);
//        }catch (Exception e){
//
//        }

//        Callable<String> callable = () -> {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("list.txt"));
//            return bufferedReader.readLine();
//        };
//        try {
//            String s = callable.call();
//            System.out.println(s);
//        } catch (Exception e) {
//            System.err.println(e.getClass());
//        }

//        String s = null;
//        Optional.ofNullable(s)
//                .ifPresentOrElse(System.out::println,
//                        () -> System.out.println("empty"));

//        Callable<Integer> callable = () -> (new Random()).nextInt(100);
//        Runnable runnable = () -> System.out.println("Runnable");
//        FutureTask<Integer> fc = new FutureTask<>(callable);
//        FutureTask<Integer> fr = new FutureTask<>(runnable, -1);
//        fc.run();
//        fr.run();
//        try {
//            int i = fc.get();
//            int j = fr.get();
//            System.out.println(i + " " + j);
//        } catch (InterruptedException | ExecutionException e) {
//
//        }

//        try {
//            System.out.println(
//                    CompletableFuture
//                            .completedFuture("RED")
//                            .get());
//        } catch (InterruptedException | ExecutionException e) {
//
//        }

//        System.out.println(
//                CompletableFuture
//                        .completedFuture("GREEN")
//                        .join());

//        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> {
//            System.out.println("EXECUTING THE FUTURE");
//            return 5;
//        });
//        System.out.println("NOT EXECUTED YET");
//        System.out.println(cf.join());

//        CompletableFuture<Integer> completableFuture = CompletableFuture
//                .supplyAsync(() -> "3")
//                .thenApply(x -> Integer.parseInt(x))
//                .thenApply(x -> ++x);
//        System.out.println(completableFuture.join());
//
//        CompletableFuture
//                .supplyAsync(() -> "RED")
//                .thenApply(x -> x.equals("RED") ? "GREEN" : "YELLOW")
//                .thenAccept(x -> System.out.println(x));

//        Supplier<Integer> s1 = () -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//            }
//            return 4;
//        };
//
//        Supplier<Integer> s2 = () -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//            }
//            return 5;
//        };

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(s1, executorService);
//        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(s2, executorService);
//
//        CompletableFuture<Void> completableFuture2 = completableFuture.acceptEitherAsync(completableFuture1,
//                x -> System.out.println(x), executorService);

//        CompletableFuture<Integer> completableFuture =
//                CompletableFuture.supplyAsync(s1);
//        CompletableFuture<String> completableFuture1 = completableFuture.thenCompose(x -> {
//            CompletableFuture<String> c = new CompletableFuture<>();
//            c.complete("Java" + Integer.toString(x));
//            return c;
//        });
//        System.out.println(completableFuture1.join());

//        Supplier<Integer> s = () -> {
//            try {
//                Thread.sleep(10_000);
//            } catch (InterruptedException e) {
//
//            }
//            return 5;
//        };
//        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(s);
//        if (cf1.cancel(true))
//            System.out.println("Future cf1 cancelled.");
//        try {
//            System.out.println(cf1.join());
//        } catch (CancellationException e) {
//            System.err.println("Cannot join cancelled future.");
//        }

//        Supplier y = () -> {
//            int[] a = {1, 2, 3, 4, 5};
//            return a[6];
//        };
//        CompletableFuture
//                .supplyAsync(y)
//                .exceptionally(x -> 0)
//                .thenAccept(System.out::println);
    }
}
