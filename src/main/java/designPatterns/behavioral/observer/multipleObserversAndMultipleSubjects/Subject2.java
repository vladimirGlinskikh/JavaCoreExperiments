package designPatterns.behavioral.observer.multipleObserversAndMultipleSubjects;

import java.util.ArrayList;
import java.util.List;

public class Subject2 implements ISubject {
    List<IObserver> observerList = new ArrayList<>();
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(int updatedValue) {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(this.getClass().getSimpleName(), updatedValue);
        }
    }
}
