package functionalInterfaces.multithreaded;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.Callable;
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

        String s = null;
        Optional.ofNullable(s)
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("empty"));
    }
}
