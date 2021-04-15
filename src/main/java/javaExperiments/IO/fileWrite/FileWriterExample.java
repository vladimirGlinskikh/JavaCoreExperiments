package javaExperiments.IO.fileWrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String text = "Nothing in this world can survive and remain useful without an update.\n Charles M. Tadros";
        try (FileWriter writer = new FileWriter("scores.txt")) {
//            for (int i = 0; i < text.length(); i++) {
//                writer.write(text.charAt(i));
//            }
            writer.write(text);
            System.out.println("Write is done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
