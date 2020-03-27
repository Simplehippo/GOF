package 行为型模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;
    private int state;

    public Subject() {
        state = 0;
        observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }


}
