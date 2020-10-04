package core.argumentsAndParameters;

public class Immutable {
    public static void main(String[] args) {
        new Immutable().run();
    }

    private void run() {
        String s = "yes";
        flip(s);
        System.out.println(s);
    }

    private void flip(String t) {
        t = new String("no");
    }
}
