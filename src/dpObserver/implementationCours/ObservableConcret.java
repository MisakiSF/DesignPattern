package dpObserver.implementationCours;

import java.util.ArrayList;
import java.util.List;

public class ObservableConcret implements Observable {
    //la relation a un plusieurs
    private List<Observer> Observers = new ArrayList<>();
    private int state;
    @Override
    public void addObserver(Observer observer) {
        Observers.add(observer);
    }
    @Override
    public void deleteObserver(Observer observer) {
        Observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : Observers) {
            observer.update(this);
        }
    }
    public void setState(int state) {
        this.state = state;
        //pour se charger de nous informer
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
