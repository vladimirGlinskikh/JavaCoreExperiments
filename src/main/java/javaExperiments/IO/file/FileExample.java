package javaExperiments.IO.file;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("list.bin");
        File folder = new File("/home/vg/Desktop/githowto");

        System.out.println("---------------------------");
        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() " + folder.getAbsolutePath());
        System.out.println("-------------------------");
        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());
        System.out.println("-------------------------");
        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());
        System.out.println("-------------------------");
        System.out.println("file.exists() " + file.exists());
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("-------------------------");
        System.out.println("file.exists() " + file.exists());
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("-------------------------");

    }
}
