package javaExperiments.IO.dataInputStreamAndDataOutputStream;

import java.io.*;

public class ReadBinFiles {
    public static void main(String[] args) {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("dell.BIN"));
             DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("scores.txt"))) {
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
