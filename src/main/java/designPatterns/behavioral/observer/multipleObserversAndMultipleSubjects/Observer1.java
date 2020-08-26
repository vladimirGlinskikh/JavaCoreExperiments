package designPatterns.behavioral.observer.multipleObserversAndMultipleSubjects;

public class Observer1 implements IObserver {
    @Override
    public void update(String s, int i) {
        System.out.println("Observer1: myValue in " + s + " is now: " + i);
    }
}
