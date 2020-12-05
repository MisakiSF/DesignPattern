package dpObserver.exo1;

import java.util.ArrayList;
import java.util.List;

public class DonneeMeteo implements Observable {
    private float temperature, hygrometrie, pression;
    private List<Observer> observers =new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }



    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature,hygrometrie,pression);
}
    }

    public void setDonneMeteo(float temperature,float hygrometrie,float pression) {
    this.temperature = temperature;
    this.hygrometrie = hygrometrie;
    this.pression = pression;
     }
}
