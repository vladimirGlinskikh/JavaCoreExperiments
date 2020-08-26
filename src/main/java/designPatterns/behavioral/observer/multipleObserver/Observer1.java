package designPatterns.behavioral.observer.multipleObserver;

public class Observer1 implements IObserver {
    @Override
    public void update(int i) {
        System.out.println("Observer1: myValue in Subject is now: " + i);
    }
}
