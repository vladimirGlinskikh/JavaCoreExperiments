package javaExperiments.IO.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationReader {
    public static void main(String[] args) {
        Employee employee;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("list.bin"))) {
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
