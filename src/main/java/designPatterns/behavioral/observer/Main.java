package designPatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Observer Pattern Demo--\n");

        Observer observer1 = new Observer();
        Subject subject1 = new Subject();

        subject1.register(observer1);
        System.out.println("Setting flag = 5");
        subject1.setFlag(5);
        System.out.println("Setting flag = 25");
        subject1.setFlag(25);

        subject1.unregister(observer1);
        System.out.println("Setting flag = 50");
        subject1.setFlag(50);
    }
}
