package javaExperiments.IO.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWriter {
    public static void main(String[] args) {
        Car car = new Car("BMW", "blue");
        Employee employee = new Employee("Vladimir", "IT", 98, 3000, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("list.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("write done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
