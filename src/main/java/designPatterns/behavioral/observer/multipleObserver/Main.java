package designPatterns.behavioral.observer.multipleObserver;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Modified Observer Pattern--");

        Subject subject = new Subject();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        subject.register(observer1);
        subject.register(observer2);

        subject.setMyValue(5);
        System.out.println();

        subject.setMyValue(25);
        System.out.println();

        subject.unregister(observer1);
        subject.setMyValue(100);
    }
}
