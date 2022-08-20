package javaRushAnswers.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final List<Character> chars = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();

        FileReader filereader = new FileReader(filename1);
        int c;
        while ((c = filereader.read()) != -1) {
            chars.add((char) c);
        }

        FileWriter filewriter = new FileWriter(filename2);
        for (int i = 1; i < chars.size(); i+=2) {
            filewriter.write(chars.get(i));
        }

        bufferedReader.close();
        filereader.close();
        filewriter.close();
    }
}