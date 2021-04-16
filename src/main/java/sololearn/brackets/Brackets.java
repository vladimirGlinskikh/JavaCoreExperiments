package sololearn.brackets;

import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s1 = new String(new char[a]).replaceAll("\0", "[");
        String s2 = new String(new char[a]).replaceAll("\0", "]");
        System.out.println(s1 + s2);
    }
}
