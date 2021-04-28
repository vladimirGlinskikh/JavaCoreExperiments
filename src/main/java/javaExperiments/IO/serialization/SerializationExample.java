package javaExperiments.IO.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("list.bin"))) {
            outputStream.writeObject(list);
            System.out.println("done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
