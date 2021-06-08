package functionalInterfaces.I2;

public class App {
    public static void main(String[] args) {
        I2.method1();
        I2 objC2 = new C2();
        I2 objC3 = new C3();
        System.out.println(objC2.method2("objC2.method2()"));
        System.out.println(objC3.method2("objC3.method2()"));
    }
}
