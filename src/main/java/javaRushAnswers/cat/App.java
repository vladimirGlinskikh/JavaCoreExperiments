package javaRushAnswers.cat;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        for (int i = 0; i < 5; i++) {
            System.out.println(cat);
        }
    }
}

class Cat {
    int count = 1;

    @Override
    public String toString() {
        return "cat" + count++;
    }
}