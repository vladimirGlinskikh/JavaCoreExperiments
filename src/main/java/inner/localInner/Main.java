package inner.localInner;

public class Main {
    private String stringMain;

    static {
        class Foo {

        }
        Foo foo = new Foo();
    }

    public void bar() {
        if (1 < 2) {
            class Test {

            }
            Test test = new Test();
        }
//        Compile time error. Will throw error because of the scope of the class
//        Test t = new Test();
//        Foo f = new Foo();
    }

    public void print() {
        String stringPrint = "";

        class Logger {
            String name = stringMain;
            String name1 = stringPrint;

            public void foo() {
                String name1 = stringPrint;
            }
        }
        Logger logger = new Logger();
    }
}
