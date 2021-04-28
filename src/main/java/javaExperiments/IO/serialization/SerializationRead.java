package javaExperiments.IO.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationRead {
    public static void main(String[] args) {
        List<String> list;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("list.bin"))) {
            list = (ArrayList) inputStream.readObject();
            System.out.println(list);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
