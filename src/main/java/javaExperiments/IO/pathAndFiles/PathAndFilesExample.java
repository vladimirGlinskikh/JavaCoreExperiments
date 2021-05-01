package javaExperiments.IO.pathAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesExample {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("list.txt");
        Path directoryPath = Paths.get("/home/vg/Desktop/githowto");

        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("list2.txt"));
        System.out.println("copy done!");
    }
}
