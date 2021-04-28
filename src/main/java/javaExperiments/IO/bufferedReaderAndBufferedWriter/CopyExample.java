package javaExperiments.IO.bufferedReaderAndBufferedWriter;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("scores1.txt"))) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
            System.out.println("copied is done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        long result = (end - start);
        System.out.println(result);
    }
}
