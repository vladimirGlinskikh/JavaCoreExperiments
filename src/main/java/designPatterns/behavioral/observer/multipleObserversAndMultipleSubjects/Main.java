package designPatterns.behavioral.observer.multipleObserversAndMultipleSubjects;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Observer Pattern--");

        Subject1 subject1 = new Subject1();
        Subject2 subject2 = new Subject2();

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();

        subject1.register(observer1);
        subject1.register(observer2);

        subject2.register(observer2);
        subject2.register(observer3);

        subject1.setMyValue(50);
        System.out.println();

        subject2.setMyValue(250);
        System.out.println();

        subject1.unregister(observer2);
        subject1.setMyValue(550);
        System.out.println();
        subject2.setMyValue(750);
    }
}
