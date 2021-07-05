package javaRushAnswers.protectedExample.package3;

import javaRushAnswers.protectedExample.package1.A;
import javaRushAnswers.protectedExample.package2.B;

public class App extends B {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        App app = new App();
        app.exampleA();
        app.exampleB();
//        a.exampleA(); // метод недоступен из другого пакета
//        b.exampleA(); // метод недоступен из другого пакета
        b.exampleB(); // метод exampleA() доступен только из метода exampleB()
    }
}
