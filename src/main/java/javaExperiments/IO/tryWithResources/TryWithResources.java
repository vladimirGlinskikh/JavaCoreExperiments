package javaExperiments.IO.tryWithResources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        try(FileReader reader = new FileReader("scores.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Read is done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
