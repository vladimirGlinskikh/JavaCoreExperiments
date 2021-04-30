package javaExperiments.IO.randomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class App {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("list.bin", "rw")) {
            int a = file.read();
            System.out.println((char) a);

            String s = file.readLine();
            System.out.println(s);

            file.seek(101);
            String s1 = file.readLine();
            System.out.println(s1);

            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("Hello guru");

            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\tVladimir");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
