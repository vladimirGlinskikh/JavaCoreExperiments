package designPatterns.behavioral.observer.multipleObserver;

public class Observer2 implements IObserver{

    @Override
    public void update(int i) {
        System.out.println("Observer2: observers -> myValue is changed in Subject to: " + i);
    }
}
