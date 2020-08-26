package designPatterns.behavioral.observer.multipleObserver;

public interface ISubject {
    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyObservers(int i);
}
