package javaExperiments.IO.fileInputStreamAndFileOutputStream;

import java.io.*;

public class CopyImage {
    public static void main(String[] args) {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("Java.png"));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("java.png"))) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("copied is done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
