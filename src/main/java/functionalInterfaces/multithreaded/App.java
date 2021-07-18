package functionalInterfaces.multithreaded;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;
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

        CompletableFuture<Integer> completableFuture = CompletableFuture
                .supplyAsync(() -> "3")
                .thenApply(x -> Integer.parseInt(x))
                .thenApply(x -> ++x);
        System.out.println(completableFuture.join());

        CompletableFuture
                .supplyAsync(() -> "RED")
                .thenApply(x -> x.equals("RED") ? "GREEN" : "YELLOW")
                .thenAccept(x -> System.out.println(x));
    }
}
